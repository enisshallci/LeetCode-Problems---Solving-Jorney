package _1loops;
/*
47. Write a program in C++ to display such a pattern for n number of rows using number. Each row will contain odd numbers of number. The first and last number of each row will be 1 and middle column will be the row number. Go to the editor
Sample Output:
 Input number of rows: 5
    1
   121
  12321
 1234321
123454321
 */
import java.util.Scanner;
public class loop47_Interesant {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {

            for (int h = 1; h <= number - i; h++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }

            System.out.println();
        }

    }
}
