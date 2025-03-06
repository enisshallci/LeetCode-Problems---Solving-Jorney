package _2strings;

import java.util.Scanner;

/*
10. Write a C++ program to check if a given string is a Palindrome or not.
A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward,
such as madam, racecar.
Example:
Sample Input: madam
Sample Output: True
 */
public class _10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a String: ");
        System.out.println(isPalindrome(input.nextLine()));
    }

    private static String isPalindrome(String fjalia) {

        fjalia = fjalia.toLowerCase();
        String reverseFjalia = "";

        for (int i = fjalia.length() - 1; i >= 0; i--) {
            reverseFjalia += fjalia.charAt(i);
        }

        if (fjalia.equals(reverseFjalia)) {
            return fjalia + " is a palindrome";
        }

        return fjalia + " is not a palindrome";
    }
}

/*
 boolean flag = true;
        for (int i = 0; i < fjalia.length() / 2; i++) {

            if (!(fjalia.charAt(i) == fjalia.charAt(fjalia.length() - 1 - i))) {
                flag = false;
                break;
            }
        }
 */