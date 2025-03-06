package _1loops;
import java.util.Scanner;
/*
30. Write a program in C++ to display the number in reverse order.
Sample Output:
Input a number: 12345
The number in reverse order is : 54321
 */
public class loop30 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();

        System.out.println("The number in reverse order is: " + reverseNumber(number));
    }

    private static int reverseNumber(int number) {

        int reverseNumber = 0;

        for (int i = number; i != 0; i /= 10) {

            int mbetja = i % 10;
            reverseNumber = (reverseNumber * 10) + mbetja;
        }

        return reverseNumber;

    }
}
