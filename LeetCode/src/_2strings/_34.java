package _2strings;

import java.util.Scanner;

/*
34. Write a C++ program that removes a specific word from a given string. Return the updated string.
Test Data:
("Exercises Practice Solution", "Solution") -> "Exercises Practice"
("Exercises Practice Solution", "Practice ") -> "Exercises Solution"
("Exercises Practice Solution", " Solution") -> " Practice Solution"
 */
public class _34 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the first string: ");
        String fjalia = input.nextLine();
        System.out.print("Input the word to delete: ");
        String fjala = input.nextLine();

        System.out.println(deleteWord(fjalia, fjala));
    }

    private static String deleteWord(String fjalia, String fjala) {

        String fjaliaRe = "";
        String[] vargu = fjalia.trim().split(" ");

        for (int i = 0; i < vargu.length; i++) {
            if (!vargu[i].equals(fjala)) {
                fjaliaRe += vargu[i] + " ";
            }
        }

        return fjaliaRe;
    }
}
