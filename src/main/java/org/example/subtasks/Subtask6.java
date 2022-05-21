package org.example.subtasks;

import java.util.HashSet;
import java.util.Set;

/*
 * 6. Задать два стека, поменять информацию местами.
 */
public class Subtask6 {

    public static void run() {
        System.out.println("Subtask 6:");
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i=0; i < (int)(Math.random() * 10 + 5); i++) {
            set1.add((int)(Math.random() * 10));
        }
        for(int i=0; i < (int)(Math.random() * 10 + 5); i++) {
            set2.add((int)(Math.random() * 10));
        }
        System.out.println(set1 + " | " + set2);

        Set<Integer> tempSet = new HashSet<>(set1);
        set1 = new HashSet<>(set2);
        set2 = new HashSet<>(tempSet);
        System.out.println(set1 + " | " + set2);

        System.out.println("\n=========================\n");
    }

}
