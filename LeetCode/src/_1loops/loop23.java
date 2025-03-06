package _1loops;
import java.util.Scanner;
/*
23. Write a program in C++ to display the sum of the series [ 9 + 99 + 999 + 9999 ...]. Go to the editor
Sample Output:
Input number of terms: 5
9 99 999 9999 99999
The sum of the serie = 111105
 */
public class loop23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int number = input.nextInt();

        series(number);
    }

    private static void series(int terms) {

        int sum = 0;
        int number = 9;

        for (int i = 1; i <= terms; i++) {

            System.out.print(number + " ");
            sum += number;
            number = (number * 10) + 9;
        }
        System.out.println("The sum of the series = " + sum);
    }
}
