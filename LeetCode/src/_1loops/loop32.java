package _1loops;
/*
32. Write a program in C++ to find the Sum of GP series. Go to the editor
Sample Output:
Input the starting number of the G.P. series: 3
Input the number of items for the G.P. series: 5
Input the common ratio of G.P. series: 2
The numbers for the G.P. series:
3 6 12 24 48
The Sum of the G.P. series: 93
 */
import java.util.Scanner;
public class loop32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the starting number of G.P. series: ");
        int start = input.nextInt();
        System.out.print("Input the number of items for the G.P. series: ");
        int items = input.nextInt();
        System.out.print("Input the common difference of G.P. series: ");
        int difference = input.nextInt();

        series(start, items, difference);
    }

    private static void series(int start, int items, int difference) {

        System.out.println("The sum of the G.P. series are: ");

        int sum = 0;
        for (int i = 1; i <= items; i++) {

            System.out.print(start + " ");
            sum += start;
            start *= difference;
        }
        System.out.println("\nThe Sum of the G.P. series: " + sum);
    }
}

