package _2strings;

import java.util.Scanner;
/*
12. Write a C++ program to insert a dash character (-) between two odd numbers in a given string of numbers.
Example:
Sample Input: 1345789
Sample Output: Result -> 1-345-789
*/
public class Bonus2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a sentence (string): ");
        String fjala = input.nextLine();


        System.out.println("Result -> " + highestRepeatedLetters(fjala));
    }

    private static String highestRepeatedLetters(String fjala) {

        String fjalaRe = "";
        int count = 0;
        for (int i = fjala.length() - 1; i >= 0; i--) {

            char c = fjala.charAt(i);
            if (count == 3) {
                fjalaRe = '-' + fjalaRe;
                count = 0;
            }

            fjalaRe = c + fjalaRe;
            count++;
        }


        return fjalaRe;
    }
}
