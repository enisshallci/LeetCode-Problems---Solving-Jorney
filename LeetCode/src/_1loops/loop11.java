package _1loops;
import java.util.Scanner;
/*
11. Write a program in C++ to find the sum of the series 1 + 1/2^2 + 1/3^3 + ..+ 1/n^n. Go to the editor
Sample Output:
Input the value for nth term: 5
1/1^1 = 1
1/2^2 = 0.25
1/3^3 = 0.037037
1/4^4 = 0.00390625
1/5^5 = 0.00032
The sum of the above series is: 1.29126
 */
public class loop11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the value for nth term: ");
        int number = input.nextInt();

        series(number);
    }

    private static void series(int term) {

        int sum = 0;
        for (int i = 1; i <= term; i++) {

            double fuqia = 1;
            for (int f = 1; f <= i; f++) {
                fuqia *= i;
            }

            double vlera = 1 / fuqia;

            System.out.println("1/" + i +"^" + i + " = " + vlera);

            sum += vlera;
        }
    }
}
