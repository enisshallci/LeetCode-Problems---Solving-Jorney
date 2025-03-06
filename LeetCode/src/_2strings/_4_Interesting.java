package _2strings;
import java.util.Scanner;

/*
4. Write a C++ program to find the largest word in a given string.
Example:
Sample Input: C++ is a general-purpose programming language.
Sample Output: programming
 */
public class _4_Interesting {
    public static void main(String[] args) {

        //String[] words = sentence.split("[ .-]");         !!!!!!

        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String fjalia = input.nextLine();

        fjalia = fjalia.trim();

        String fjala = "", fjalaGjate = null;
        int count = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < fjalia.length(); i++) {

            char c = fjalia.charAt(i);
            if (c == ' ' || c == ',' || c == '.' || c == '-') {
                if (count > max) {
                    fjalaGjate = fjala;
                    max = count;
                }
                count = 0;
                fjala = "";
            } else {
                fjala += c;
                count++;
            }
        }

        System.out.println("Sample output: " + fjalaGjate);

    }
}
