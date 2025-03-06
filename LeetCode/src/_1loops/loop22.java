package _1loops;
import java.util.Scanner;
/*
22. Write a program in C++ to display the n terms of harmonic series and their sum. Go to the editor
1 + 1/2 + 1/3 + 1/4 + 1/5 ... 1/n terms
Sample Output:
Input number of terms: 5
1/1 + 1/2 + 1/3 + 1/4 + 1/5
The sum of the series upto 5 terms: 2.28333
 */
public class loop22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int number = input.nextInt();

        series(number);
    }

    private static void series(int number) {

        double sum = 0;
        for (int i = 1; i <= number; i++) {

            System.out.print("1/" + i + (i < number ? " + " : " "));
            sum += 1 / (double)i;
        }

        System.out.println("\nThe sum of the series upto " + number + " terms: " + sum);
    }
}
