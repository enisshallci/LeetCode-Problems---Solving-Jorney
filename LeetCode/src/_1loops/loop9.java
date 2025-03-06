package _1loops;
import java.util.Scanner;
/*9 Write a program in C++ to find the Greatest Common Divisor (GCD) of two numbers. Go to the editor
Sample Output:
Input the first number: 25
Input the second number: 15
The Greatest Common Divisor is: 5       (Pjestuesi me i madhe i perbashket)
 */
public class loop9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int number1 = input.nextInt();
        System.out.print("Input the second number: ");
        int number2 = input.nextInt();

        System.out.println("The Greatest Common Divisor is: " + findGCD(number1, number2));;
    }

    private static int findGCD(int number1, int number2) {

        int min;
        if (number1 >= number2)
            min = number1;
        else
            min = number2;

        for (int i = min; i >= 1; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                return i;
            }
        }

        return 1;       //1shin gjithqysh nese number1 dhe number2 jane numra te thjeshte.

    }
}
