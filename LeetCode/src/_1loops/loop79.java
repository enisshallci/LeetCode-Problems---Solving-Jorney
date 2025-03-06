package _1loops;
import java.util.Scanner;
/*
79. Write a program in C++ to convert a hexadecimal number to decimal number. Go to the editor
Sample Output:
Input any 32-bit Hexadecimal Number: 25
The value in decimal number is: 37
 */
public class loop79 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input any hex number: ");
        String hexaDecimal = input.nextLine();

        //hexadecimal to decimal:
        int decimal = 0;
        int j = 1;
        for (int i = hexaDecimal.length() - 1; i >= 0; i--) {

            int k;
            char karakteri = hexaDecimal.charAt(i);
            if (karakteri >= 65 && karakteri <= 70) {
                k = karakteri - ('A' - 10);
            } else {
                k = karakteri - '0';
            }

            decimal += k * j;
            j *= 16;
        }

        System.out.println("Decimal: " + decimal);

    }
}
