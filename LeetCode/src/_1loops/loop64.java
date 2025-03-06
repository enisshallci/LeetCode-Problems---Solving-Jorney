package _1loops;
import java.util.Scanner;
/*
64. Write a program in C++ to find one's complement of a binary number. Go to the editor
    Sample Output:
    Input a 8 bit binary value: 10100101
    The original binary = 10100101
    After ones complement the number = 01011010
 */
public class loop64 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a 8 bit binary value: ");
        String binary = input.nextLine();

        System.out.println("The original binary: " + binary);
        System.out.println("After ones complement the number: " + onesComplement(binary));
    }

    private static String onesComplement(String number) {

        char[] karakteret = number.toCharArray();       //ngase Strings ne java jane immutable:
        for (int i = 0; i < karakteret.length; i++) {
            if (karakteret[i] == '0')       //Nese eshte 0, beje 1.
                karakteret[i] = '1';
            else                                //Nese nuk eshte 0, eshte 1 prandaj bone 0.
                karakteret[i] = '0';
        }

        String onesComplement = new String(karakteret);        //ose me loop me StringBuilder.
        return onesComplement;
    }
}
