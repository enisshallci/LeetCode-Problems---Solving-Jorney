package _1loops;

import java.util.Scanner;
/*
54. Write a program in C++ to display the pattern like pyramid, power of 2.
Sample Output:
Input the number of rows: 5
                 1
              1  2  1
           1  2  4  2  1
        1  2  4  8  4  2  1
	1	2  4  8  16  8  4  2  1

 */
public class loop54 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int row = input.nextInt();

        for (int i = 1; i <= row; i++) {

            //hapesirat:
            for (int h = 1; h <= row - i; h++) {
                System.out.print("   ");
            }

            int count = 1;

            for (int j = 1; j <= i; j++) {

                System.out.print(count + "  ");
                count *= 2;
            }

            count /= 2;     //KUJDES Mos harro !!!!

            for (int k = 1; k < i; k++) {

                count /= 2;
                System.out.print(count + "  ");
            }

            System.out.println();
        }

    }
}
