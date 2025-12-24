/*
 (Analyze scores) Write a program that reads an unspecified number of scores and determines
how many scores are above or equal to the average and how many scores are below the
average. Enter a negative number to signify the end of the input. Assume that the maximum
number of scores is 100.
 */
package Lap09;

import java.util.Scanner;

public class Lap09_1 {
   public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
        System.out.println("Enter scores of students (-1 to stop):");

        int[] scores = new int[100];
        double sum = 0;
        int num = 0;

        System.out.print("Enter score : ");
        int score = input.nextInt();

        while (score != -1) {
            if (num >= 100) break; 
            sum += score;
            scores[num] = score;
            num++;
            System.out.print("Enter score : ");
            score = input.nextInt();
        }

        if (num == 0) { 
            System.out.println("Scores above or equal to average : 0");
            System.out.println("Scores below average : 0");
            return;
        }

        double average = sum / num;
        int up = 0, down = 0;
        for (int i = 0; i < num; i++) {
            if (scores[i] >= average)
                up++;
            else
                down++;
        }

        System.out.println("Scores above or equal to average : " + up);
        System.out.println("Scores below average : " + down);
    }
}