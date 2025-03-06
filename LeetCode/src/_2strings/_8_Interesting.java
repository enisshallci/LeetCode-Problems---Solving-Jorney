package _2strings;

import java.util.Scanner;

/*
8. Write a C++ program to count all the words in a given string.
Example:
Sample Input: Python
Sample Output: number of words -> 1
 */
public class _8_Interesting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a sentence (string): ");
        String fjalia = input.nextLine();

        System.out.println(fjalia + " -> " + countWords(fjalia));
    }

    private static int countWords(String fjalia) {

        //Mundemi me perdor metoden trim() per me i largu hapesirat ne fillim dhe ne fund te fjalise:
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < fjalia.length(); i++) {

            char c = fjalia.charAt(i);

            if (c == ' ' && !flag) {
                continue;           //Nese ka hapesire ne fillim , mos i numero.
            }

            if (c != ' ' && !flag) {    //si te behet true, ma ktu nuk hin
                flag = true;
            }

            if (!((c >= 65 && c <= 90) || (c >= 97 && c <= 122))) {
                count++;
            }

            else if (i == fjalia.length() - 1) {     //nese fundi eshte pa pike ose pa hapesire.
                count++;
            }
        }

        return count;
    }
}
