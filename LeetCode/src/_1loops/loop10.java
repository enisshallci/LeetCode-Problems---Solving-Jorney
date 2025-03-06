package _1loops;
import java.util.Scanner;
/*
10. Write a program in C++ to find the sum of digits of a given number. Go to the editor
Sample Output:
Input a number: 1234
The sum of digits of 1234 is: 10
 */
public class loop10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a number ");
        int number = input.nextInt();

        System.out.println("The sum of digits of " + number + " is: " + sumOfDigits(number));
    }

    private static int sumOfDigits(int number) {

        int sum = 0;
        for (int i = number; i != 0; i /= 10) {

            int mbetja = i % 10;
            sum += mbetja;
        }

        return sum;
    }
}
