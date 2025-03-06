package _1loops;
/*
39. Write a program in C++ to make such a pattern like a pyramid with numbers increased by 1. Go to the editor
Sample Output:
 Input number of rows: 4
       1
      2 3
     4 5 6
    7 8 9 10
 */
import java.util.Scanner;
public class loop39 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int number = input.nextInt();

        int hapesira = number - 1;
        int count = 1;
        for (int i = 1; i <= number; i++) {

            for (int h = 1; h <= hapesira; h++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }

            hapesira--;
            System.out.println();
        }

    }
}
