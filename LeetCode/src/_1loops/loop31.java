package _1loops;
import java.util.Scanner;
/*
31. Write a program in C++ to find out the sum of an A.P. series. Go to the editor
Sample Output:
Input the starting number of the A.P. series: 1
Input the number of items for the A.P. series: 8
Input the common difference of A.P. series: 5
The Sum of the A.P. series are :
1 + 6 + 11 + 16 + 21 + 26 + 31 + 36 = 148
 */
public class loop31 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the starting number of A.P. series: ");
        int start = input.nextInt();
        System.out.print("Input the number of items for the A.P. series: ");
        int items = input.nextInt();
        System.out.print("Input the common difference of A.P. series: ");
        int difference = input.nextInt();

        series(start, items, difference);
    }

    private static void series(int start, int items, int difference) {

        System.out.println("The sum of the A.P. series are: ");

        int sum = 0;
        for (int i = 1; i <= items; i++) {

            System.out.print(start + (i < items ? " + " : " = "));
            sum += start;
            start += difference;
        }
        System.out.println(sum);
    }
}
