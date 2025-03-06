package _1loops;
import java.util.Scanner;
/*
83. Write a program in C++ to compute the sum of the digits of an integer. Go to the editor
Sample Output:
Input any number: 25
The sum of the digits of the number 25 is: 7
 */
public class loop83 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input any number: ");
        int number = input.nextInt();

        int shuma = 0;
        while (number != 0) {
            int mbetja = number % 10;
            shuma += mbetja;
            number /= 10;
        }

        System.out.println("The sum of the digits of the number " + number + " is: " + shuma);
    }
}
