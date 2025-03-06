package _1loops;
import java.util.Scanner;
/*
57. Write a program in C++ to find the sum of first and last digit of a number. Go to the editor
Sample Output:
Input any number: 12345
The first digit of 12345 is: 1
The last digit of 12345 is: 5
The sum of first and last digit of 12345 is: 6
 */
public class loop57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input any number: ");
        int number = input.nextInt();

        int firstDigit;
        int lastDigit = number % 10;
        int count = 1;

        for (firstDigit = number; firstDigit >= 10; firstDigit /= 10) {
            count++;
        }

        System.out.println("The first digit of " + number + " is: " + firstDigit);
        System.out.println("The last digit of " + number + " is: " + lastDigit);
        System.out.println("The sum of first and last digit of " + number + " is: " + (firstDigit + lastDigit));
        System.out.println("The number of digits of the " + number + " is: " + count);

    }
}
