package _1loops;
import java.util.Scanner;
/*
43. Write a program in C++ to print the Floyd's Triangle. Go to the editor
Sample Output:
Input number of rows: 5
1
01
101
0101
10101
 */
public class loop43 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input number of rows: ");
        int number = input.nextInt();

        int temp = 0;
        int p, q;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {

                if (i % 2 != 0) {
                    p = 1;
                    q = 0;
                } else {
                    p = 0;
                    q = 1;
                }

                if (j % 2 != 0) {
                    System.out.print(p);
                } else {
                    System.out.print(q);
                }

            }
            System.out.println();
        }

    }
}
