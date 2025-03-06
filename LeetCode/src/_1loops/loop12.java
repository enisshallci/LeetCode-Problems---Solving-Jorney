package _1loops;
import java.util.Scanner;
/*
12. Write a program in C++ to calculate the sum of the series (1*1) + (2*2) + (3*3) + (4*4) + (5*5) + ... + (n*n). Go to the editor
Sample Output:
Input the value for nth term: 5
1*1 = 1
2*2 = 4
3*3 = 9
4*4 = 16
5*5 = 25
The sum of the above series is: 55
 */
public class loop12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the value for nth term: ");
        int number = input.nextInt();

        series(number);
    }

    private static void series(int term) {

        int sum = 0;

        for (int i = 1; i <= term; i++) {

            System.out.println(i + "*" + i + " = " + (i * i));
            sum += i * i;
        }

        System.out.println("The sum above series is: " + sum);
    }
}
