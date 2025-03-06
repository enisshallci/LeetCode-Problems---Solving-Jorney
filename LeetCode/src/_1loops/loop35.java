package _1loops;
import java.util.Scanner;
/*
35. Write a program in C++ to display the pattern like right angle triangle using an asterisk. Go to the editor
Sample Output:
Input number of rows: 5
*
**
***
****
*****
 */
public class loop35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

