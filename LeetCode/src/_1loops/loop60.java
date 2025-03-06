package _1loops;

import java.util.Scanner;

public class loop60 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input any number: ");
        int num = input.nextInt();

        String[] number = printNumberInWords(num);
        for (String s : number) {
            System.out.print(s + " ");
        }
    }

    private static String[] printNumberInWords(int num) {

        String number = Integer.toString(num);

        String[] words = new String[number.length()];
        int temp = 0;
        for (int i = 0; i < number.length(); i++) {

            char c = number.charAt(i);
            switch (c) {
                case '0' -> words[temp++] = "Zero";
                case '1' -> words[temp++] = "One";
                case '2' -> words[temp++] = "Two";
                case '3' -> words[temp++] = "Three";
                case '4' -> words[temp++] = "Four";
                case '5' -> words[temp++] = "Five";
                case '6' -> words[temp++] = "Six";
                case '7' -> words[temp++] = "Seven";
                case '8' -> words[temp++] = "Eight";
                case '9' -> words[temp++] = "Nine";
            }
        }

        return words;
    }
}
