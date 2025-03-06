package _2strings;
import java.util.Scanner;
/*
3. Write a C++ program to capitalize the first letter of each word in a given string. Words must be separated by only one space.
Example:
Sample Input: cpp string exercises
Sample Output: Cpp String Exercises
 */
public class _3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a sentence (string): ");
        String fjalia = input.nextLine();

        fjalia = fjalia.trim();     //largoj hapesirat nese ka , ne fillim te fjalise dhe ne fund.

        String fjaliaRe = "";
        for (int i = 0; i < fjalia.length(); i++) {

            char c = fjalia.charAt(i);
            if (i == 0) {
                fjaliaRe += (char) (c - 32);
            } else if (c == ' ') {
                fjaliaRe += ' ';
                fjaliaRe += (char) (fjalia.charAt(i + 1) - 32);
                i++;
            } else {
                fjaliaRe += c;
            }
        }

        System.out.println("Sample Output: " + fjaliaRe);
    }
}
