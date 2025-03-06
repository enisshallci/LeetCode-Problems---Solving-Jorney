package _2strings;
import java.util.Scanner;
/*
39. Write a C++ program that checks whether a given string contains unique characters or not.
Return true if the string contains unique characters otherwise false.
Test Data:
("Filename") -> 0
("abc") -> 1
 */
public class _39 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: " );
        String text1 = input.nextLine();

        System.out.println(uniqueCharacters(text1));
    }

    private static boolean uniqueCharacters(String fjalia) {

        boolean flag = true;
        for (int i = 0; i < fjalia.length(); i++) {

            for (int j = i + 1; j < fjalia.length(); j++) {
                if (fjalia.charAt(i) == fjalia.charAt(j)) {
                    flag = false;
                    break;
                }
            }

            if (!flag) {
                break;
            }
        }

        return flag;
    }
}
