package _1loops;
import java.util.Scanner;
/*
73. Write a program in C++ to convert a binary number to decimal number. Go to the editor
Sample Output:
Input a binary number: 10110
The decimal number: 22
 */
public class loop73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        int binary = input.nextInt();

        int decimal = 0, j = 1;
        int mbetja;
        for (int i = binary; i != 0; i /= 10) {

            mbetja = i % 10;
            decimal += mbetja * j;
            j *= 2;
        }


        System.out.println("The decimal number: " + decimal);

    }
}
