package _1loops;

import java.util.Scanner;

/*
75. Write a program in C++ to convert a binary number to octal number. Go to the editor
Sample Output:
Input a binary number: 1011
The equivalent octal value of 1011 is : 13
 */
public class loop75 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        int binary = input.nextInt();


        //binary to decimal:
        int decimal = 0;
        int j = 1;
        for (int i = binary; i != 0; i /= 10) {

            int mbetja = i % 10;
            decimal += mbetja * j;
            j *= 2;
        }


        //decimal to oktal

        String oktal =  "";
        for (int i = decimal; i != 0; i /= 8) {

            int mbetja = i % 8;
            oktal = mbetja + oktal;
        }

        System.out.println("Binary: " + binary);
        System.out.println("Decimal: " + decimal);
        System.out.println("Oktal: " + oktal);

    }
}
