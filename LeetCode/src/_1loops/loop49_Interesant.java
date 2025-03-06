package _1loops;
import java.util.Scanner;
/*
49. Write a program in C++ to print a pyramid of digits as shown below for n number of lines. Go to the editor
    1
   232
  34543
 4567654
567898765
 */
public class loop49_Interesant {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {

            //hapesirat:
            for (int h = 1; h <= number - i; h++) {
                System.out.print(" ");
            }

            for (int j = i; j <= 2 * i - 1; j++) {
                System.out.print(j);
            }

            for (int k = 2 * i - 2; k >= i; k--) {
                System.out.print(k);
            }

            System.out.println();
        }

    }
}
