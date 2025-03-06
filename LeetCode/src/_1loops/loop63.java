package _1loops;
import java.util.Scanner;
/*
63. Write a program in C++ to enter any number and print all factors of the number. Go to the editor
Sample Output:
Input a number: 63
The factors are: 1 3 7 9 21 63
 */
public class loop63 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the base: ");
        int number = input.nextInt();

        printFactors(number);
    }

    private static void printFactors(int number) {

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
