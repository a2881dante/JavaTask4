package org.example.subtasks;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/*
 * 5. Занести стихотворения одного автора в список. Провести сортировку по возрастанию длин строк.
 */
public class Subtask5 {
    public static void run() {
        System.out.println("Subtask 5:");

        ArrayList<String> poems = new ArrayList<>();
        try (FileReader fr = new FileReader("assets/subtask_5_out.txt")) {
            System.out.println("Read file 'assets/subtask_5_out.txt'...");
            Scanner sc = new Scanner(fr);
            StringBuilder poem = new StringBuilder();
            String line = "";
            while(sc.hasNext()) {
                line = sc.nextLine();
                if(!sc.hasNext() || line.equals("")) {
                    poems.add(poem.toString());
                    poem.setLength(0);
                } else {
                    poem.append(line).append("\n");
                }
            }
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }

        poems.sort(Comparator.comparingInt(String::length));

        try (FileWriter fw = new FileWriter("assets/subtask_5_in.txt")) {
            for (String poem : poems) {
                fw.write(poem + '\n');
            }
            System.out.println("Write file 'assets/subtask_5_in.txt'...");
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
        System.out.println("\n=========================\n");
    }
}
