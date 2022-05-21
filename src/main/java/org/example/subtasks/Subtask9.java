package org.example.subtasks;

import java.util.*;

/*
 * 9. Сложить два многочлена заданной степени, если коэффициенты многочленов хранятся в объекте HashMap.
 */
public class Subtask9 {

    public static void run() {
        System.out.println("Subtask 9:");
        Map<Integer, Integer> polynomial1 = new HashMap<>();
        Map<Integer, Integer> polynomial2 = new HashMap<>();

        for(int i=0; i < (int)(Math.random() * 10 + 5); i++) {
            polynomial1.put(i, (int)(Math.random() * 10));
        }
        for(int i=0; i < (int)(Math.random() * 10 + 5); i++) {
            polynomial2.put(i, (int)(Math.random() * 10));
        }

        showPolynomial(polynomial1);
        showPolynomial(polynomial2);

        Map<Integer, Integer> polynomial3 = new HashMap<>();
        HashSet<Integer> keys = new HashSet<>(polynomial1.keySet());
        keys.addAll(polynomial2.keySet());
        for(int key: keys) {
            polynomial3.put(
                    key,
                    polynomial1.getOrDefault(key, 0) + polynomial2.getOrDefault(key, 0)
            );
        }
        showPolynomial(polynomial3);

        System.out.println("\n=========================\n");
    }

    public static void showPolynomial(Map<Integer, Integer> polynomial) {
        TreeSet<Integer> keys = new TreeSet<>(polynomial.keySet());
        StringBuilder expr = new StringBuilder();

        for(int key: keys) {
            int val = polynomial.get(key);
            if(val != 0) {
                expr.append(polynomial.get(key));
                if (key != 0) {
                    expr.append("x");
                    if(key != 1) {
                        expr.append("^").append(key);
                    }
                }
                if (key != keys.size() - 1) {
                    expr.append(" + ");
                }
            }
        }
        System.out.println(expr);
    }

}
