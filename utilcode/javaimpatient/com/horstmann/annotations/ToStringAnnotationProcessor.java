package javaimp.javaimpatient.com.horstmann.annotations;

import java.beans.Introspector;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic.Kind;
import javax.tools.JavaFileObject;

@SupportedAnnotationTypes("com.horstmann.annotations.ToString")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class ToStringAnnotationProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations,
            RoundEnvironment currentRound) {
        if (annotations.size() == 0) return true;
        try {
            JavaFileObject sourceFile = processingEnv.getFiler().createSourceFile("com.horstmann.annotations.ToStrings");
            try (PrintWriter out = new PrintWriter(sourceFile.openWriter())) {
                out.println("// Automatically generated by com.horstmann.annotations.ToStringAnnotationProcessor");
                out.println("package com.horstmann.annotations;");
                out.println("public class ToStrings {");

                for (Element e : currentRound.getElementsAnnotatedWith(ToString.class)) {
                    if (e instanceof TypeElement) {
                        TypeElement te = (TypeElement) e;
                            writeToStringMethod(out, te);
                    }
                }   
                out.println("    public static String toString(Object obj) {");
                out.println("        return java.util.Objects.toString(obj);");
                out.println("    }");
                out.println("}");
            }
        } catch (IOException ex) {
            processingEnv.getMessager().printMessage(Kind.ERROR, ex.getMessage());
        }        
        return true;
    }
    
    private void writeToStringMethod(PrintWriter out, TypeElement te) {
        String className = te.getQualifiedName().toString();
        out.println("    public static String toString(" + className + " obj) {");
        ToString ann = te.getAnnotation(ToString.class);
        out.println("        StringBuilder result = new StringBuilder();");
        if (ann.includeName()) out.println("        result.append(\"" + className + "\");");        
        out.println("        result.append(\"[\");");
        boolean first = true;
        for (Element c : te.getEnclosedElements()) {
            String methodName = c.getSimpleName().toString();
            ann = c.getAnnotation(ToString.class);
            if (ann != null) {             
                if (first) first = false; else out.println("        result.append(\",\");");
                if (ann.includeName()) {
                    String fieldName = Introspector.decapitalize(methodName.replaceAll("^(get|is)", ""));
                        // Turn getWidth into width, isDone into done, getURL into URL 
                    out.println("        result.append(\"" + fieldName + "=" + "\");"); 
                }
                out.println("        result.append(toString(obj." + methodName + "()));");
            }
        }
        out.println("        result.append(\"]\");");
        out.println("        return result.toString();");
        out.println("    }");
    }    
}