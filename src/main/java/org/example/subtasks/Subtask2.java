package org.example.subtasks;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/*
 * 2. Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.
 */
public class Subtask2 {
    public static void run() {
        System.out.print("Subtask 2:" +
                "\nEnter num: ");
        Scanner sc = new Scanner(System.in);
        String intStr = Integer.toString(sc.nextInt());
        ArrayList<Integer> numStack = new ArrayList<>(intStr.length());

        for(char ch: intStr.toCharArray()) {
            numStack.add( Character.getNumericValue(ch) );
        }

        ListIterator<Integer> iterator = numStack.listIterator(numStack.size());
        while(iterator.hasPrevious()) {
            System.out.print(iterator.previous());
        }
    }
}
