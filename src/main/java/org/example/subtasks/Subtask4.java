package org.example.subtasks;

import java.util.ArrayList;

/*
 * 4. Создать стек из номеров записи. Организовать прямой доступ к элементам записи.
 */
public class Subtask4 {
    public static void run() {
        System.out.println("Subtask 4:");
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0; i < 10; i++) {
            numbers.add((int)(Math.random() * 1000));
        }
        System.out.println(numbers);
        int randNum = (int)(Math.random() * 9);
        System.out.println("Value #" + (randNum+1) + ": " + numbers.get(randNum));
        System.out.println("\n=========================\n");
    }
}
