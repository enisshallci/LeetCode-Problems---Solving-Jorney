package _2strings;
/*
26. Write a C++ program to check if a given string is a title-cased string or not. When the string is title cased, return "True", otherwise return "False".
Example:
Original String:
The Quick Brown Fox.
Check the said string is a title cased string or not!
True
 */
import java.util.Scanner;

public class _26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a text: " );
        String text = input.nextLine();

        System.out.println(checkTitleCase(text));
    }

    private static boolean checkTitleCase(String fjalia) {

        boolean flag = true;
        for (int i = 0; i < fjalia.length(); i++) {

            char c = fjalia.charAt(i);
            if (i == 0) {
                if (!(c >= 65 && c <= 90)) {
                    flag = false;
                    break;
                }
            }

            if (c == ' ') {
                if (!(fjalia.charAt(i + 1) >= 65 && fjalia.charAt(i + 1) <= 90)) {
                    flag = false;
                    break;
                }
            }
        }

        return flag;
    }
}
