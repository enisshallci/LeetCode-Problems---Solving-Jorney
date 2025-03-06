package _1loops;
import java.util.Scanner;
/*
25. Write a program in C++ to find the sum of the series [ x - x^3 + x^5 + ......]. Go to the editor
Sample Output:
Input the value of x: 2
Input number of terms: 5
The values of series:
2
-8
32
-128
512
The sum of the series upto 5 term is: 410
 */
public class loop25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the value of x: ");
        int x = input.nextInt();
        System.out.print("Input number of terms: ");
        int terms = input.nextInt();

        series(x, terms);
    }

    private static void series(int x, int terms) {

        System.out.println("The values of series: ");
        int sum = 0;
        int exponent = 1;
        for (int i = 1; i <= terms; i++) {

            int fuqia = 1;
            int shenja = 1;
            int termi;

            if (i % 2 == 0) {
                shenja = -1;
            }

            //fuqia:
            for (int e = 1; e <= exponent; e++) {
                fuqia *= x;
            }

            termi = shenja * fuqia;
            System.out.println(termi);
            sum += termi;
            exponent += 2;
        }

        System.out.println("The sum of the series upto " + terms + " terms is: " + sum);
    }
}
