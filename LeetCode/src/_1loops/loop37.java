package _1loops;
import java.util.Scanner;
/*
37. Write a program in C++ to make such a pattern like right angle triangle using number which will repeat the number for that row. Go to the editor
Sample Output:
Input number of rows: 5
1
22
333
4444
55555
 */
public class loop37 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
