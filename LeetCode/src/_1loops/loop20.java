package _1loops;
import java.util.Scanner;
/*
20. Write a program in C++ to display the n terms of odd natural number and their sum. Go to the editor
Sample Output:
Input number of terms: 5
The odd numbers are: 1 3 5 7 9
The Sum of odd Natural Numbers upto 5 terms: 25
 */
public class loop20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int number = input.nextInt();

        nonPrimeNumbers(number);
    }

    private static void nonPrimeNumbers(int number) {

        System.out.println("The odd numbers are:");
        int num = 1;
        int sum = 0;
        for (int i = 1; i <= number; i++) {

            sum += num;
            System.out.print(num + " ");
            num += 2;
        }

        System.out.println("\nThe sum of odd Natural Numbers upto " + number + " terms: " + sum);
    }
}
