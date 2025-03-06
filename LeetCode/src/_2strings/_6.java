package _2strings;

import java.util.Scanner;
/*
6. Write a C++ program to check whether the characters "e" and "g" are separated by exactly 2 places anywhere in a given
string at least once.
Sample Input: eagerer
Sample Output: eagerer -> 1
 */
public class _6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a sentence (string): ");
        String fjalia = input.nextLine();

        System.out.println(fjalia + " -> " + checkSeparatedChars(fjalia));
    }

    private static int checkSeparatedChars(String fjalia) {

        int count = 0;
        for (int i = 0; i < fjalia.length() - 2; i++) {

            char c = fjalia.charAt(i);
            if (c == 'e') {
                if (fjalia.charAt(i + 2) == 'g') {
                    count++;
                    i += 2;
                }
            }
        }

        return count;
    }
}
