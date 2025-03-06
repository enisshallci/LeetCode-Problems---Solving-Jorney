package _1loops;
import java.util.Scanner;
/*
45. Write a program in C++ to display Pascal's triangle like pyramid. Go to the editor
Sample Output:
 Input number of rows: 6
          1
        1   1
      1   2   1
    1   3   3   1
  1   4   6   4   1
1   5   10  10  5   1
 */
public class loop45_PASCAL_TRIANGLE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int row = input.nextInt();

        int c = 0;
        for (int i = 0; i < row; i++) {

            //hapesirat:
            for (int h = 1; h < row - i; h++) {
                System.out.print("  ");     //dy rreshta kqyre nalt e kupton, secili numer 2 rreshta
            }

            for (int j = 0; j <= i; j++) {

                if (j == 0) {
                    c = 1;
                }
                else {
                    c = c * (i - j + 1) / j;
                }

                System.out.print(c + "   ");
            }

            System.out.println();
        }

    }
}