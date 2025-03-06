package _2strings;
import java.util.Scanner;
/*
27. Write a C++ program to insert a space when a lower character follows an upper character in a given string.
Example:
Original String:
TheQuickBrownFox.
Insert white spaces between lower and uppercase Letters in the said string:
The Quick Brown Fox.
 */
public class _27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first string: ");
        String string1 = input.nextLine();

        System.out.println(insertSpace(string1));
    }

    private static String insertSpace(String fjalia) {

        String fjaliaRe = "";
        for (int i = 0; i < fjalia.length() - 1; i++) {

            char c = fjalia.charAt(i);
            fjaliaRe += c;
            if (c >= 'a' && c <= 'z') {
                if (fjalia.charAt(i + 1) >= 'A' && fjalia.charAt(i + 1) <= 'Z')
                    fjaliaRe += ' ';
            }
            else if (c >= 'A' && c <= 'Z') {
                if (fjalia.charAt(i + 1) >= 'A' && fjalia.charAt(i + 1) <= 'Z')
                    fjaliaRe += ' ';
            }
        }

        fjaliaRe += fjalia.charAt(fjalia.length() - 1);

        return fjaliaRe;
    }
}
