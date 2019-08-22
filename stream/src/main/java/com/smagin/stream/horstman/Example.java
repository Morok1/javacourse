package com.smagin.stream.horstman;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("/Users/evgenij/Documents/Проекты/Мои/projects/javacourse/stream/src/main/java/com/smagin/stream/alice.txt")), StandardCharsets.UTF_8);
        List<String> words  = Arrays.asList(contents.split("\\PL+"));
        words.stream().forEach(System.out::println);


        words.stream().sorted((o1, o2) -> o1.length() - o2.length()).forEach(System.out::println);


    }
}
