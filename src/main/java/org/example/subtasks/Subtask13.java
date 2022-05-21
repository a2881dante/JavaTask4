package org.example.subtasks;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * 13. Задан файл с текстом на английском языке. Выделить все различные слова. Слова, отличающиеся
 * только регистром букв, считать одинаковыми.
 */
public class Subtask13 {

    public static void run() {
        System.out.println("Subtask 7:");
        Set<String> uniqueWords = new HashSet<>();
        try {
            String text = String.valueOf(
                    Files.readAllLines(
                            Paths.get("assets/subtask_13.txt"),
                            StandardCharsets.UTF_8));
            String[] words = text.split("\\s");
            uniqueWords.addAll(Arrays.asList(words));
            System.out.println("All words: " + words.length);
            System.out.println("Unique words: " + uniqueWords.size());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\n=========================\n");
    }

}
