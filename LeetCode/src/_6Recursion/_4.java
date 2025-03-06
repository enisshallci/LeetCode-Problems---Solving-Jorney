package _6Recursion;
/*
    4. Write a C++ program to implement a recursive function to calculate the sum of digits of a given number.
 */
public class _4 {
    public static void main(String[] args) {

        int vlera = sumOfDigits(1234);
        System.out.println(vlera);

    }

    private static int sumOfDigits(int number) {

        //base case:
        if (number == 0) {
            return 0;
        }

        //recursive case:
        return (number % 10) + sumOfDigits(number / 10);

    }
}
