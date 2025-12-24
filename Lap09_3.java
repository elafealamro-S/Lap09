/*
 (Strictly Identical arrays) The arrays list1 and list2 are strictly identical if their
corresponding elements are equal. Write a program that prompts the user to enter two lists of
integers and displays whether the two are strictly identical.
 */
package Lap09;

import java.util.Scanner;

public class Lap09_3 {

   
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the lists : ");
        int s = input.nextInt();

        int[] list = new int[s];
        int[] list2 = new int[s];

        System.out.print("Enter " + s + " elements of list 1 : ");
        for (int i = 0; i < s; i++) {
            list[i] = input.nextInt();
        }

        System.out.print("Enter " + s + " elements of list 2 : ");
        for (int i = 0; i < s; i++) {
            list2[i] = input.nextInt();
        }

        boolean identical = true;
        for (int i = 0; i < s; i++) {
            if (list[i] != list2[i]) {
                identical = false;
                break;
            }
        }

        if (identical)
            System.out.println("The two lists are identical");
        else
            System.out.println("The two lists are not identical");
    }
}