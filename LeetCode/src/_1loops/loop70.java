package _1loops;
import java.util.Scanner;
/*
70. Write a program in C++ to convert a decimal number to binary number. Go to the editor
Sample Output:
Input a decimal number: 35
The binary number is: 100011
 */
public class loop70 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int decimal = input.nextInt();

        String binary = "";
        for (int i = decimal; i != 0; i /= 2) {

            int mbetja = i % 2;
            binary = mbetja + binary;
        }

        System.out.println("The binary number is: " + binary);
    }
}
