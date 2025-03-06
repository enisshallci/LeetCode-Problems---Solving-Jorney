package _1loops;

import java.util.Scanner;

/*
48. Write a program in C++ to display the pattern like pyramid using the alphabet. Go to the editor
Sample Output:
 Input the number of Letters (less than 26) in the Pyramid: 5
        A
      A B A
    A B C B A
  A B C D C B A
A B C D E D C B A
 */
public class loop48_Interesant {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int number = input.nextInt();

        for (int i = 1; i <= 5; i++) {

            char c = 'A';

            //hapesirat:
            for (int h = 1; h <= number - i; h++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(c++);
            }

            c -= 2;

            for (int k = i - 1; k >= 1; k--) {
                System.out.print(c--);
            }

            System.out.println();
        }

    }
}
