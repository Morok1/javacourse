// Automatically generated by com.horstmann.annotations.ToStringAnnotationProcessor
package javaimp.javaimpatient.com.horstmann.annotations;
public class ToStrings {
    public static String toString(ch11.sec05.Point obj) {
        StringBuilder result = new StringBuilder();
        result.append("[");
        result.append(toString(obj.getX()));
        result.append(",");
        result.append(toString(obj.getY()));
        result.append("]");
        return result.toString();
    }
    public static String toString(ch11.sec05.Rectangle obj) {
        StringBuilder result = new StringBuilder();
        result.append("ch11.sec05.Rectangle");
        result.append("[");
        result.append(toString(obj.getTopLeft()));
        result.append(",");
        result.append("width=");
        result.append(toString(obj.getWidth()));
        result.append(",");
        result.append("height=");
        result.append(toString(obj.getHeight()));
        result.append("]");
        return result.toString();
    }
    public static String toString(Object obj) {
        return java.util.Objects.toString(obj);
    }
}
