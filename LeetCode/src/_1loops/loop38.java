package _1loops;
import java.util.Scanner;
/*
38. Write a program in C++ to make such a pattern like right angle triangle with number increased by 1. Go to the editor
Sample Output:
Input number of rows: 4
1
2 3
4 5 6
7 8 9 10
 */
public class loop38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int number = input.nextInt();

        int count = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }


    }
}
