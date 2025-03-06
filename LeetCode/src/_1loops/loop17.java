package _1loops;
import java.util.Scanner;
/*
17. Write a program in C++ to print a square pattern with # character. Go to the editor
Sample Output:
Print a pattern like square with # character:
--------------------------------------------------
Input the number of characters for a side: 4
# # # #
# # # #
# # # #
# # # #
 */
public class loop17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of characters for a side: ");
        int number = input.nextInt();

        pattern(number);
    }

    private static void pattern(int number) {

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }

    }
}
