package _1loops;
import java.util.Scanner;
/*
6. Write a program in C++ to find a prime number within a range.
Input number for starting range: 1
Input number for ending range: 100
The prime numbers between 1 and 100 are:
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
The total number of prime numbers between 1 to 100 is: 25
 */
public class loop6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a number to find the last prime number occurs before the number: ");
        int number = input.nextInt();

        System.out.println(findLastPrimeNumber(number));;

    }

    private static int findLastPrimeNumber(int number) {

        for (int i = number - 1; i > 1; i--) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                return i;
            }
        }

        return 2;       //numri i fundit qe mundet me u kthy
    }
}
