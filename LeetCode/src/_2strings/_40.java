package _2strings;

import java.util.Scanner;

/*
40. For two given strings, str1 and str2, write a C++ program to select only the characters in str2, that are lowercase in the
other string (str1) at the same position. Return characters as a single string.
Test Data:
("Java", "jscript") -> "scr"
("jScript", "Java") -> "Jva"
("cpp", "c++") -> "c++"
 */
public class _40 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: " );
        String text1 = input.nextLine();
        System.out.print("Input a string: " );
        String text2 = input.nextLine();

        System.out.println(uniqueCharacters(text1, text2));
    }

    private static String uniqueCharacters(String fjalia1, String fjalia2) {

        String fjalia = "";
        for (int i = 0; i < fjalia1.length(); i++) {

            if (i > fjalia2.length() - 1) {
                break;
            }

            char c = fjalia1.charAt(i);
            if (c >= 97 && c <= 122) {
                fjalia += fjalia2.charAt(i);
            }
        }

        return fjalia;

    }
}
