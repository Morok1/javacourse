package com.smagin.stream;

import java.util.stream.Stream;

public class CreationStream {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("as", "asa");
        stringStream.sorted().forEach(System.out::println);

        Stream<String> stringStream1 = Stream.empty();
        }
}
