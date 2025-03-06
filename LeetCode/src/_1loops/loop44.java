package _1loops;
/*
44. Write a program in C++ to display the pattern like a diamond. Go to the editor
Sample Output:
 Input number of rows (half of the diamond): 5
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */
import java.util.Scanner;

public class loop44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows (half of the diamond): ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int h = 1; h <= number - i; h++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = number - 1; i >= 1; i--) {
            for (int h = 1; h <= number - i; h++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
