/*
 (Count single digits) Write a program that generates 100 random integers between 0 and 9
and displays the count of each number. (Hint: Use an array of ten integers to store the counts
for the number of 0s, 1s, ..., 9s.)
 */
package Lap09;

import java.util.Scanner;

public class Lap09_2 {

    public static void main(String[] args) {
               Scanner input = new Scanner(System.in);
        int[] c = new int[10];

        for (int i = 0; i < 100; i++) {
            int number = (int)(Math.random() * 10);
            c[number]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Count of " + i + " generated : " + c[i]);
        }
    }
} 
    
    

