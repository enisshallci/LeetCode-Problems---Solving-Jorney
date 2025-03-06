package _1loops;
import java.util.*;
/*
74. Write a program in C++ to convert a binary number to hexadecimal number. Go to the editor
Sample Output:
Input a binary number: 1011
The hexadecimal value: B
 */
public class loop74ShumInteresant {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        int binary = input.nextInt();


        //binary to decimal:
        int decimal = 0, j = 1;
        for (int i = binary; i != 0; i /= 10) {

            int mbetja = i % 10;
            decimal += mbetja * j;
            j *= 2;
        }

        //decimal to hexadecimal:
        String hexaDecimal = "";
        for (int i = decimal; i != 0; i /= 16) {

            int mbetja = i % 16;
            if (mbetja > 9) {
                hexaDecimal = (char)(mbetja + 55) + hexaDecimal;
            } else {
                hexaDecimal = mbetja + hexaDecimal;
            }

        }

        System.out.println("Binary: " + binary);
        System.out.println("Decimal: " + decimal);
        System.out.println("Hexadecimal: " + hexaDecimal);

    }
}
