package _1loops;
import java.util.Scanner;
/*
40. Write a program in C++ to make such a pattern like a pyramid with an asterisk. Go to the editor
Sample Output:
 Input number of rows: 5
        *
       * *
      * * *
     * * * *
    * * * * *
 */
public class loop40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int number = input.nextInt();

        int hapesira = number - 1;
        for (int i = 1; i <= number; i++) {

            for (int h = 1; h <= hapesira; h++) {
                System.out.print(" ");
            }
            hapesira--;

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
