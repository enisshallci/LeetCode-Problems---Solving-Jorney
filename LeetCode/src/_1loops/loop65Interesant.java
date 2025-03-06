package _1loops;
import java.util.Scanner;
/*
65. Write a program in C++ to find two's complement of a binary number. Go to the editor
Sample Output:
Input a 8 bit binary value: 01101110
The original binary = 01101110
After ones complement the value = 10010001
After twos complement the value = 10010010
 */
public class loop65Interesant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        String binary = input.nextLine();


        System.out.println("The original binary = " + binary);
        String onesComplement = new String(onesComplement(binary));
        System.out.println("After ones complement the number = " + onesComplement);
        String twosComplement = new String(twosComplement(binary));
        System.out.println("After twos complement the number = " + twosComplement);
    }

    private static char[] onesComplement(String binary) {

        char[] karakteret = binary.toCharArray();

        for (int i = 0; i < karakteret.length; i++) {
            if (karakteret[i] == '0') {
                karakteret[i] = '1';
            } else if (karakteret[i] == '1') {
                karakteret[i] = '0';
            } else {
                System.out.println("INVALID INPUT");
                return null;
            }
        }

        return karakteret;
    }

    private static char[] twosComplement(String binary) {

        char[] twosComplement = onesComplement(binary);

        int mbetja = 1;
        for (int i = twosComplement.length - 1; i >= 0; i--) {
            if (twosComplement[i] == '1' && mbetja == 1) {
                twosComplement[i] = '0';
            } else if (twosComplement[i] == '0' && mbetja == 1) {
                twosComplement[i] = '1';
                mbetja = 0;
            }
        }

        return twosComplement;
    }
}
