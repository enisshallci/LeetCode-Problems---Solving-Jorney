package _1loops;
import java.util.Scanner;
/*
42. Write a program in C++ to display the pattern like a pyramid using asterisk and each row contain an odd number of asterisks. Go to the editor
Sample Output:
 Input number of rows: 4
    *
   ***
  *****
 *******
 */
public class loop42_Interesant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {

            for (int h = 1; h <= number - i; h++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
