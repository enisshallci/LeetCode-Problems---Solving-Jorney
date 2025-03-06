package _1loops;
import java.util.Scanner;
/*
21. Write a program in C++ to display the n terms of even natural number and their sum. Go to the editor
Sample Output:
Input number of terms: 5
The even numbers are: 2 4 6 8 10
The Sum of even Natural Numbers upto 5 terms: 30
 */
public class loop21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int terms = input.nextInt();

        evenNumbers(terms);
    }

    private static void evenNumbers(int terms) {

        int even = 2;
        int sum = 0;
        System.out.println("The even numbers are: ");
        for (int i = 1; i <= terms; i++) {

            sum += even;
            System.out.print(even + " ");
            even += 2;
        }

        System.out.println("\nThe sum of even Natural Numbers upto " + terms + " terms: " + sum);
    }
}
