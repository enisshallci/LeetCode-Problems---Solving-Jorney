package _1loops;
import java.util.Scanner;
/*
36. Write a program in C++ to display the pattern like right angle triangle with number. Go to the editor
Sample Output:
Input number of rows: 5
1
12
123
1234
12345
 */
public class loop36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            int count = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(count++);
            }
            System.out.println();
        }
    }
}
