package _2strings;
import java.util.Scanner;
/*
22. Write a C++ program to remove all special characters from a given string.
Example:
Original string: abcd $ js# @acde$
New string after removing the special characters from the said string:
abcd js acde
 */
public class _22 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the word: ");
        String fjalia = input.nextLine();

        String fjaliaRe = newString(fjalia);
        System.out.println(fjaliaRe);
    }

    private static String newString(String fjalia) {

        String fjaliaRe = "";

        for (int i = 0; i < fjalia.length(); i++) {

            char c = fjalia.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || c == ' ') {
                fjaliaRe += c;
            }
        }

        //Largoj dy hapesira ose me shume (space), nese ka:
        String fjaliaFinale = "";
        for (int i = 0; i < fjaliaRe.length(); i++) {

            char c = fjaliaRe.charAt(i);
            if (c == ' ') {
                fjaliaFinale += ' ';
                for (int j = i + 1; j < fjaliaRe.length(); j++) {
                    if (fjaliaRe.charAt(j) == ' ') {
                        i = j;
                    } else
                        break;
                }
            } else {
                fjaliaFinale += c;
            }
        }

        return fjaliaFinale;
    }
}