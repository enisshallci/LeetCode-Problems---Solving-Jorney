package _1loops;
import java.util.Scanner;
/*
60. Write a program in C++ to input any number and print it in words. Go to the editor
Sample Output:
Input any number: 8309
Eight Three Zero Nine
 */
public class loop60_ReversedInteger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input any number: ");
        int number = input.nextInt();

        String[] words = printNumberToWords(number);
        for (String s : words) {
            System.out.print(s + " ");
        }
    }

    private static String[] printNumberToWords(int number) {

        int reversedNumber = 0;
        int count = 0;
        for (int i = number; i != 0; i /= 10) {

            int mbetja = i % 10;
            reversedNumber = (reversedNumber * 10) + mbetja;
            count++;
        }

        String[] words = new String[count];
        int temp = 0;

        for (int i = reversedNumber; i != 0; i /= 10) {

            int mbetja = i % 10;
            switch(mbetja) {
                case 0 -> words[temp++] = "Zero";
                case 1 -> words[temp++] = "One";
                case 2 -> words[temp++] = "Two";
                case 3 -> words[temp++] = "Three";
                case 4 -> words[temp++] = "Four";
                case 5 -> words[temp++] = "Five";
                case 6 -> words[temp++] = "Six";
                case 7 -> words[temp++] = "Seven";
                case 8 -> words[temp++] = "Eight";
                case 9 -> words[temp++] = "Nine";
            }
        }

        for (int i = count - 1; i > 1; i--) {

            if (words[i] == null) {
                words[i] = "Zero";
            } else if (words[i] != null) {
                break;
            }
        }

        return words;
    }
}
