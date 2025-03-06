package _1loops;
import java.util.Scanner;

/*
46. Write a program in C++ to display Pascal's triangle like right angle traingle. Go to the editor
Sample Output:
Input number of rows: 7
1
1   1
1   2   1
1   3   3   1
1   4   6   4   1
1   5   10   10   5   1
1   6   15   20   15   6   1
 */
public class loop46_PASCAL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int row = input.nextInt();

        int c = 0;
        for (int i = 0; i < row; i++) {

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
