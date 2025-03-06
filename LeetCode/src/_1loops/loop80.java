package _1loops;
import java.util.Scanner;
/*
80. Write a C++ program to convert a hexadecimal number to a binary number.
Sample Output:
Input any 32-bit Hexadecimal Number: 5f
The equivalant binary number is: 1011111
 */
public class loop80 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input any hex number: ");
        String hexaDecimal = input.nextLine();

        //hexadecimal to decimal:
        int decimal = 0;
        int j = 1;
        for (int i = hexaDecimal.length() - 1; i >= 0; i--) {

            char karakteri = hexaDecimal.charAt(i);

            if (karakteri >= 65 && karakteri <= 70) {
                decimal += (karakteri - ('A' - 10)) * j;
            } else if (karakteri >= 48 && karakteri <= 57){
                decimal += (karakteri - '0') * j;
            }

            j *= 16;
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
