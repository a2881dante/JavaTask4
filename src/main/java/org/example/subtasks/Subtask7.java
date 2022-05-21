package org.example.subtasks;

import java.util.HashSet;
import java.util.Set;

/*
 * 7. Определить множество на основе множества целых чисел. Создать методы для определения
 * пересечения и объединения множеств.
 */
public class Subtask7 {

    public static void run() {
        System.out.println("Subtask 7:");

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i=0; i < 10; i++) {
            set1.add((int)(Math.random() * 10));
            set2.add((int)(Math.random() * 10));
        }
        System.out.println(set1);
        System.out.println(set2);
        System.out.println("union:" + union(set1, set2));
        System.out.println("intersection:" + intersection(set1, set2));
        System.out.println("\n=========================\n");
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }
}
