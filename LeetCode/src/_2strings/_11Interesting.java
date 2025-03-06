package _2strings;
import java.util.LinkedHashMap;
import java.util.Scanner;
/*
11. Write a C++ program to find a word in a given string that has the highest number of repeated letters.
Example:
Sample Input: Print a welcome text in a separate line.
Sample Output: Word which has the highest number of repeated letters. separate
 */
public class _11Interesting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String fjalia = input.nextLine();

        fjalia = fjalia.trim();     //largoj nese ka hapesirat (spaces) ne fillim dhe ne fund te fjalise.

        String word = "", mosRepeatedLetters = null;
        int max = 0;
        for (int i = 0; i < fjalia.length(); i++) {

            char c = fjalia.charAt(i);

            if (c == ' ' || c == ',' || c == '.' || c == '-') {
                int count = countRepeatedLetters(word);
                if (count > max) {
                    max = count;
                    mosRepeatedLetters = word;
                }
                word = "";
            }
            else {
                word += c;
            }
        }

        System.out.println("Word which has the highest number of repeated letters: " + mosRepeatedLetters);
    }

    private static int countRepeatedLetters(String word) {

        LinkedHashMap<Character, Integer> countChars = new LinkedHashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (countChars.containsKey(c)) {
                countChars.put(c, countChars.get(c) + 1);
            } else {
                countChars.put(c, 1);
            }
        }

        int count = 0;
        for (char c : countChars.keySet()) {
            if (countChars.get(c) > 1) {
                count++;
            }
        }

        return count;
    }
}
