package _1loops;
import java.util.Scanner;
/*
13. Write a program in C++ to calculate the series (1) + (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+4+...+n). Go to the editor
Sample Output:
Input the value for nth term: 5
1 = 1
1+2 = 3
1+2+3 = 6
1+2+3+4 = 10
1+2+3+4+5 = 15
The sum of the above series is: 35
 */
public class loop13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the value for nth term: ");
        int number = input.nextInt();

        series(number);
    }

    private static void series(int term) {

        int sum = 0;
        for (int i = 1; i <= term; i++) {
            int vlera = 0;
            for (int j = 1; j <= i; j++) {
                System.out.print(j + (i == j ? " = " : "+"));
                vlera += j;
            }
            System.out.println(vlera);
            sum += vlera;
        }

        System.out.println("The sum of the above series is: " + sum);

    }
}
