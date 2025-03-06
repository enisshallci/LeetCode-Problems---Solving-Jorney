package _1loops;

import java.util.ArrayList;
import java.util.Scanner;
/*
77. Write a program in C++ to convert a octal number to binary number. Go to the editor
Sample Output:
Input any octal number: 17
The equivalent binary number: 1111
 */
public class loop77 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input any octal number: ");
        int octal = input.nextInt();

        //octal to decimal

        int decimal = 0;
        int j = 1;
        for (int i = octal; i != 0; i /= 10) {

            int mbetja = i % 10;
            decimal += mbetja * j;
            j *= 8;
        }

        //decimal to binary
        String binary = "";
        for (int i = decimal; i != 0; i /= 2) {

            int mbetja = i % 2;
            binary = mbetja + binary;
        }

        System.out.println("Binary: " + binary);
    }
}
