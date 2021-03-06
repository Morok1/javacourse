package javaimp.javaimpatient.ch08.sec01;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CountLongWords {
    private final static String PATH = "/Users/evgenij/Documents/Проекты/Мои/projects/javacourse/stream/src/main/resources/alice.txt";
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get(PATH)),
                StandardCharsets.UTF_8);
        List<String> words = List.of(contents.split("\\PL+"));

        long count = 0;
        for (String w : words) {
            if (w.length() > 12)
                count++;
        }
        System.out.println(count);

        count = words.stream().filter(w -> w.length() > 12).count();
        System.out.println(count);

        count = words.parallelStream().filter(w -> w.length() > 12).count();
        System.out.println(count);
    }
}
