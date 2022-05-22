package org.example.subtasks;

import java.util.ArrayList;

/*
 * 11. Не используя вспомогательных объектов, переставить отрицательные элементы данного списка в конец,
 * а положительные — в начало списка.
 */
public class Subtask11 {

    public static void run() {
        System.out.println("Subtask 11:");
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0; i < 10; i++) {
            numbers.add((int)(Math.random() * 20 - 10));
        }
        System.out.println(numbers);
        int index = 0, done = 0;
        while(index < numbers.size() - done)
        {
            int number = numbers.get(index);
            if(number < 0) {
                numbers.add(number);
                numbers.remove(Integer.valueOf(number));
                done++;
            } else {
                index++;
            }
        }
        System.out.println(numbers);
        System.out.println("\n=========================\n");
    }

}
