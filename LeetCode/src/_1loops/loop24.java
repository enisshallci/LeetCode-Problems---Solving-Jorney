package _1loops;
import java.util.Scanner;
/*
24. Write a program in C++ to display the sum of the series [ 1+x+x^2/2!+x^3/3!+....]. Go to the editor
Sample Output:
Input the value of x: 3
Input number of terms: 5
The sum is : 16.375
 */
public class loop24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the value of x: ");
        int x = input.nextInt();
        System.out.print("Input number of terms: ");
        int terms = input.nextInt();

        series(x, terms);
    }

    private static void series(int x, int terms) {

        double sum = 0;
        for (int i = 0; i < terms; i++) {

            double fuqia = 1;
            double faktorieli = 1;
            double termi;

            //fuqizimi:
            for (int e = 1; e <= i; e++) {
                fuqia *= x;
            }

            //faktorieli:
            for (int f = i; f > 1; f--) {
                faktorieli *= f;
            }


            termi = fuqia / faktorieli;
            sum += termi;

            if (i == 0) {
                System.out.print(1 + " + ");
            }
            else if (i == 1) {
                System.out.print(x + " + ");
            } else {
                System.out.print(x + "^" + i + "/" + i + "!" + (i == terms - 1 ? " " : " + "));
            }
        }

        System.out.println("\nThe sum is: " + sum);

    }
}
