package _2strings;

import java.util.Scanner;
/*
12. Write a C++ program to insert a dash character (-) between two odd numbers in a given string of numbers.
Example:
Sample Input: 1345789
Sample Output: Result-> 1-345-7891
 */
public class _12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a String: ");
        String number = input.nextLine();

        String newNumber = "";
        for (int i = 0; i < number.length() - 1; i++) {

            char c1 = number.charAt(i);
            newNumber += c1;

            char c2 = number.charAt(i + 1);
            if ((c1 - '0') % 2 == 1 && (c2 - '0') % 2 == 1) {
                newNumber += '-';
            }

            if (i == number.length() - 2) {
                newNumber += c2;
            }
        }

        System.out.println("The new String: " + newNumber);
    }
}
