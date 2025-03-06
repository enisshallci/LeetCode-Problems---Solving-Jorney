package _2strings;
import java.util.Scanner;
/*
28. Write a C++ program to extract the first specified number of vowels from a given string.
If the specified number is less than the number of vowels present in the text,
display "n is less than the number of vowels present in the string".
Example:
Input a string:
Input a number:
Extract the first n number of vowels from the said string:
n is less than number of vowels present in the string!
 */
public class _28 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String string = input.nextLine();
        System.out.print("Input a number: ");
        int number = input.nextInt();

        int count = 0;
        for (int i = 0; i < string.length(); i++) {

            char c = string.charAt(i);
            switch(c) {
                case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' -> count++;
            }
        }

        if (number < count) {
            System.out.println("Guessed number is less than number of vowels present in the string.");
        } else if (number > count) {
            System.out.println("Guessed number is more than number of vowels present in the string.");
        } else {
            System.out.println("Guessed number is equal with the number of vowels");
        }
    }
}
