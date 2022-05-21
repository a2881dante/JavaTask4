package org.example.subtasks;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/*
 * 1. Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
 */
public class Subtask1 {

    public static void run() {
        System.out.println("Subtask 1:");
        ArrayList<String> fileLinesList = new ArrayList<>();
        try (FileReader fr = new FileReader("assets/subtask_1_out.txt")) {
            System.out.println("Read file 'assets/subtask_1_out.txt'...");
            Scanner sc = new Scanner(fr);
            while(sc.hasNext()) {
                fileLinesList.add(sc.nextLine());
            }
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }

        try (FileWriter fw = new FileWriter("assets/subtask_1_in.txt")) {
            ListIterator<String> iterator = fileLinesList.listIterator(fileLinesList.size());
            while(iterator.hasPrevious()) {
                fw.write(iterator.previous() + '\n');
            }
            System.out.println("Write file 'assets/subtask_1_in.txt'...");
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }

}
