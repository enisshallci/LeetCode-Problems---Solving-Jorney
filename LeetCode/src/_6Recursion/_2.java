package _6Recursion;
/*
    2. Write a C++ program to calculate the factorial of a given number using recursion.
 */
public class _2 {
    public static void main(String[] args) {

        int vlera = factorial(5);
        System.out.println(vlera);
    }

    private static int factorial(int n) {

        //base case:
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);        //recursive case:
    }
}
