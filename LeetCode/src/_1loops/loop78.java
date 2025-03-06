package _1loops;

import java.util.Scanner;
/*
78. Write a program in C++ to convert a octal number to a hexadecimal number. Go to the editor
Sample Output:
Input any octal number: 77
The hexadecimal value of 77 is: 3F
 */
public class loop78 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input any octal number: ");
        int octal = input.nextInt();

        //octal to decimal:
        int decimal = 0;
        int j = 1;
        for (int i = octal; i != 0; i /= 10) {

            int mbetja = i % 10;
            decimal += mbetja * j;
            j *= 8;
        }

        //decimal to hexadecimal:
        String hexaDecimal = "";
        for (int i = decimal; i != 0; i /= 16) {

            int mbetja = i % 16;
            if (mbetja > 9) {
                hexaDecimal = (char)(55 + mbetja) + hexaDecimal;
            } else {
                hexaDecimal = mbetja + hexaDecimal;
            }
        }

        System.out.println(hexaDecimal);


    }
}
