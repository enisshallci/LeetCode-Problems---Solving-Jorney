package _2strings;
import java.util.Scanner;
/*
33. A string is created using the letters of another string. Letters are case sensitive.
Write a C++ program to verify that the letters in the second string appear in the first string. Return true otherwise false.
Test Data:
("CPP", "Cpp") -> false
("Java", "Ja") -> true
("Check first string", "sifC") ->true
 */
public class _33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: " );
        String text1 = input.nextLine();
        System.out.print("Input a string: " );
        String text2 = input.nextLine();

        System.out.println(checkUpperOrLowerCase(text1, text2));
    }

    private static boolean checkUpperOrLowerCase(String fjalia1, String fjalia2) {

        if (fjalia1.length() < fjalia2.length()) {
            System.out.println("Invalid Input!");
            return false;
        }

        int count = 0;
        for (int i = 0; i < fjalia2.length(); i++) {

            char c = fjalia2.charAt(i);
            for (int j = 0; j < fjalia1.length(); j++) {
                if (c == fjalia1.charAt(j)) {
                    count++;
                    break;
                }
            }
        }

        if (count == fjalia2.length()) {
            return true;
        }
        return false;
    }
}
