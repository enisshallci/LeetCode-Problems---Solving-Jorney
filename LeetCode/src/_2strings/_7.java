package _2strings;

import java.util.Scanner;

/*
7. Write a C++ program to count all the vowels in a given string.
Example:
Sample Input: eagerer
Sample output: number of vowels -> 4
 */
public class _7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a sentence (string): ");
        String fjalia = input.nextLine();

        System.out.println(fjalia + " -> " + countVowels(fjalia));
    }

    private static int countVowels(String fjalia) {

        String lowerCase = fjalia.toLowerCase();
        int count = 0;
        for (int i = 0; i < fjalia.length(); i++) {

            char c = lowerCase.charAt(i);
            switch(c) {
                case 'a', 'e', 'i', 'o', 'u' -> count++;
            }
        }

        return count;
    }
}
