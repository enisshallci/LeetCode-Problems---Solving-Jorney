package _1loops;
import java.util.Scanner;
/*
27. Write a program in C++ to display the first n terms of Fibonacci series. Go to the editor
Sample Output:
Input number of terms to display: 10
Here is the Fibonacci series upto to 10 terms:
0 1 1 2 3 5 8 13 21 34
 */
public class loop27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of terms to display: ");
        int terms = input.nextInt();

           fibonaci(terms);
    }

    private static void fibonaci(int number) {

        int before = 0;
        int next = 1;
        System.out.println("Here is the Fibonacci series upto " + number + " terms:");
        for (int i = 1; i <= number; i++) {

            System.out.print(before + " ");
            int temp = before;
            before = next;
            next = temp + before;
        }
    }
}
