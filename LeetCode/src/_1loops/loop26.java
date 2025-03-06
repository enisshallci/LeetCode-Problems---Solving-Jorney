package _1loops;
import java.util.Scanner;
/*
26. Write a program in C++ to find the sum of the series 1 +11 + 111 + 1111 + .. n terms. Go to the editor
Sample Output:
Input number of terms: 5
1 + 11 + 111 + 1111 + 11111
The sum of the series is: 12345
 */
public class loop26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int terms = input.nextInt();

        series(terms);
    }

    private static void series(int terms) {

        int sum = 0;
        int number = 1;
        for (int i = 1; i <= terms; i++) {

            System.out.print(number + (i == terms ? " " : " + "));
            sum += number;
            number = (number * 10) + 1;
        }
        System.out.println("\nThe sum of the series is: " + sum);
    }
}
