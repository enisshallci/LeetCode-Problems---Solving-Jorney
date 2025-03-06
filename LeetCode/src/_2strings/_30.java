package _2strings;

import java.util.Scanner;

/*
30. Write a C++ program to identify the missing letter in a given string (list of alphabets).
The method returns, "There is no missing letter!" if no letters are missing from the string.
Example:
Original string: abcdef
Identify the missing letter in the said string:
There is no missing letter!
 */
public class _30 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: " );
        String text = input.nextLine();


        System.out.println(missingLetters(text));
    }

    private static String missingLetters(String fjalia) {

        boolean flag = true;
        char letter = ' ';
        for (int i = 0; i < fjalia.length() - 1; i++) {

            char c = fjalia.charAt(i);
            if (!(fjalia.charAt(i + 1) == (char) (c + 1))) {
                flag = false;
                letter = (char) (c + 1);
                break;
            }
        }

        if (flag) {
            return "There is no missing letter in the said string.";
        }

        return "Theres is missing letter in the string, and that letter is: " + letter;
    }
}
