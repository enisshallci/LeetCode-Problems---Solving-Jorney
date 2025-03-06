package _6Recursion;
/*
    3. Write a C++ program to implement a recursive function to get the nth Fibonacci number.

    0 1 1 2 3 5 8 13 21 34
 */
public class _3 {
    public static void main(String[] args) {

        System.out.println(fibonaci(8));
    }

    private static int fibonaci(int number) {

        //base case
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }

        return fibonaci(number - 1) + fibonaci(number - 2);
    }
}