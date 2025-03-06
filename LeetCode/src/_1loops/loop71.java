package _1loops;

import java.util.Scanner;
/*
71. Write a program in C++ to convert a decimal number to hexadecimal number. Go to the editor
Sample Output:
Input a decimal number: 43
The hexadecimal number is : 2B
 */
public class loop71 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a decimal number: ");
        int decimal = input.nextInt();

        String hexaDecimal = "";
        for (int i = decimal; i != 0; i /= 16) {

            int mbetja = i % 16;
            if (mbetja > 9) {
                hexaDecimal = (char) (mbetja + 55) + hexaDecimal;
            } else {
                hexaDecimal = mbetja + hexaDecimal;
            }
        }

        System.out.println("The hexadecimal number is: " + hexaDecimal);

    }
}
