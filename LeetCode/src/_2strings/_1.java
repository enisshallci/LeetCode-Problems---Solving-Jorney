package _2strings;
import java.util.Scanner;
/*
1. Write a C++ program to reverse a given string.
Example:
Sample Input: w3resource
Sample Output: ecruoser3w
 */
public class _1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sample input: ");
        String fjalia = input.nextLine();

//        StringBuilder reverse = new StringBuilder();      vetem nje objekt krijohet.

        String reverse = new String();

        for (int i = fjalia.length() - 1; i >= 0; i--) {

            reverse += fjalia.charAt(i);
        }

        System.out.println("Sample Output: " + reverse);

    }
}
