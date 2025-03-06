package _1loops;
import java.util.Scanner;
/*
76. Write a program in C++ to convert a octal number to decimal number. Go to the editor
Sample Output:
Input any octal number: 17
The equivalent decimal number: 15
 */
public class loop76 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input an octal number: ");
        int octal = input.nextInt();

        int decimal = 0;
        int j = 1;
        for (int i = octal; i != 0; i /= 10) {

            int mbetja = i % 10;
            decimal += mbetja * j;
            j *= 8;
        }

        System.out.println("Decimal: " + decimal);

    }
}
