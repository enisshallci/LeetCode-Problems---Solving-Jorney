package _1loops;
import java.util.Scanner;
/*
14. Write a program in C++ to find the sum of series 1 - X^2/2! + X^4/4!-.... upto nth term. Go to the editor
Sample Output:
Input the value of X: 3
Input the value for nth term: 4
term 1 value is: 1
term 2 value is: -4.5
term 3 value is: 3.375
term 4 value is: -1.0125
The sum of the above series is: -1.1375
 */
public class loop14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the value of X: ");
        int x = input.nextInt();
        System.out.print("Input the value for nth term: ");
        int number = input.nextInt();

        series(x, number);
    }

    private static void series(int x, int term) {

        int count = 0;
        double sum = 0;
        for (int i = 1; i <= term; i++) {

            int fuqia = 1;
            double faktorieli = 1;
            int shenja = 1;

            if (i % 2 == 0) {
                shenja = -1;
            }

            //fuqia:
            for (int f = 1; f <= count; f++) {
                fuqia *= x;
            }

            //faktorieli:
            for (int f = count; f >= 1; f--) {
                faktorieli *= f;
            }

            count += 2;
            double vlera = shenja * (fuqia / faktorieli);
            System.out.println("Term " + i + " value is: " + vlera);
            sum += vlera;
        }

        System.out.println("The sum of the above series is: " + sum);
    }
}
