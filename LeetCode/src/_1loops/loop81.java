package _1loops;

import java.util.Scanner;
/*
81. Write a program in C++ to convert a hexadecimal number to octal number. Go to the editor
Sample Output:
Input any 32-bit Hexadecimal Number: 5f The equivalant octal number is: 137
 */
public class loop81 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input any 32-bit Hexadecimal Number: ");
        String hexaDecimal = input.nextLine();

        //hexaDecimal to Decimal:
        int decimal = 0, j = 1;
        for (int i = hexaDecimal.length() - 1; i >= 0; i--) {

            char c = hexaDecimal.charAt(i);
            if (c >= 65 && c <= 70) {
                decimal += ((int) c - 55) ;
            } else {
                decimal += ((int) c - 48) * j;
            }
            j *= 16;
        }


        String octal = "";
        for (int i = decimal; i != 0; i /= 8) {

            octal = (i % 8) + octal;
        }

        System.out.println("The value in decimal number is: " + octal);

    }
}
