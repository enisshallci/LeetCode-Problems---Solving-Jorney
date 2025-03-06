package _1loops;
import java.util.Scanner;
/*
58. Write a program in C++ to calculate product of digits of any number. Go to the editor
Sample Output:
Input a number: 3456
The product of digits of 3456 is: 360
 */
public class loop58 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input any number: ");
        int number = input.nextInt();


        int product = 1;
        for (int i = number; i != 0; i /= 10) {

            int mbetja = i % 10;
            product *= mbetja;
        }

        System.out.println("The product of digits of " + number + " is: " + product);
    }
}
