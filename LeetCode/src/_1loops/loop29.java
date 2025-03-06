package _1loops;
import java.util.Scanner;
/*
29. Write a program in C++ to find LCM of any two numbers using HCF. Go to the editor
Sample Output:
Input 1st number for LCM: 15
Input 2nd number for LCM: 25
The LCM of 15 and 25 is: 75
 */
public class loop29 {
    public static void main(String[] args) {

        //Shumefishi me i vogel i perbashket:

        Scanner input = new Scanner(System.in);
        System.out.print("Input 1st number for LCM: ");
        int first = input.nextInt();
        System.out.print("Input 2nd number for LCM: ");
        int second = input.nextInt();

        System.out.println("The LCM of " + first + " and " + second + " is: " + findLCM(first, second));
    }

    private static int findLCM(int number1, int number2) {

        int max;
        if (number1 > number2)
            max = number1;
        else
            max = number2;

        for (int i = max; i <= (number1 * number2); i++) {

            if (i % number1 == 0 && i % number2 == 0) {

                return i;
            }
        }

        return number1 * number2;
    }
}
