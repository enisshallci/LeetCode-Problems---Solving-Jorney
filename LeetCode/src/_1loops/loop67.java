package _1loops;
import java.util.Scanner;
/*
67. Write a program in C++ to calculate the sum of the series 1.2+2.3+3.4+4.5+5.6+....... Go to the editor
Sample Output:
Input the last integer between 1 to 98 without fraction you want to add: 10
1.2 + 2.3 + 3.4 + 4.5 + 5.6 + 6.7 + 7.8 + 8.9 + 9.1 + 10.11
The sum of the series = 59.61
 */
public class loop67 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the last integer between 1 to 98 without fraction you want to add: ");
        int n = input.nextInt();

        double sum = 0;
        double p, number;

        for (int i = 1; i <= n; i++) {

            if (i < 9) {
                p = 0.1;
            } else if (i < 99) {
                p = 0.01;
            } else {
                p = 0.001;
            }

            number = i + ((i + 1) * p);
            System.out.print(number);
            if (i < n) {
                System.out.print(" + ");
            }
            sum += number;

        }

        System.out.println("\nThe sum of the series: " + sum);

    }
}
