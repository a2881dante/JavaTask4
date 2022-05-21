package org.example.subtasks;

import java.util.*;

/*
 * 8. С использованием множества выполнить попарное суммирование произвольного конечного ряда чисел по
 * следующим правилам: на первом этапе суммируются попарно рядом стоящие числа,на втором этапе суммируются
 * результаты первого этапа и т. д. до тех пор, пока не останется одночисло.
 */
public class Subtask8 {

    public static void run() {
        System.out.println("Subtask 8:");
        int randCount = (int)(Math.random() * 10 + 5);
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0; i < randCount; i++) {
            nums.add((int)(Math.random() * 100));
        }
        System.out.println(nums);

        ArrayList<Integer> tempNums = new ArrayList<>();
        Iterator<Integer> iterator;
        while(nums.size() > 1) {
            iterator = nums.iterator();
            while (iterator.hasNext()){
                int sum = iterator.next();
                if(iterator.hasNext()) {
                    sum += iterator.next();
                }
                tempNums.add(sum);
            }
            nums.clear();
            nums.addAll(tempNums);
            tempNums.clear();
            System.out.println(nums);
        }
        System.out.println("\n=========================\n");
    }
}
