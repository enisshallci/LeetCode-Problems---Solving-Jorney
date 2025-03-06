package _1loops;
import java.util.Scanner;

/*
72. Write a program in C++ to convert a decimal number to octal number. Go to the editor
Sample Output:
Input a decimal number: 15
The octal number is: 17
 */
public class loop72 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a decimal number: ");
        int decimal = input.nextInt();

        String oktal = "";
        for (int i = decimal; i != 0; i /= 8) {

            oktal = (i % 8) + oktal;
        }

        System.out.println("The hexadecimal number is: " + oktal);
    }
}
