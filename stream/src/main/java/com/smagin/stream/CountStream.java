package com.smagin.stream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CountStream {
    private final static String PATH = "/Users/evgenij/Documents/Проекты/Мои/projects/javacourse/stream/src/main/resources/alice.txt";

    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get(PATH)),
                StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("\\PL+"));
//        words.stream().forEach(System.out::println);

        long count = words.stream().filter(s -> s.length() > 12).count();
    }

}
