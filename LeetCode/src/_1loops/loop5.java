package _1loops;
/*
5. Write a program in C++ to check whether a number is prime or not.
Sample Output:
Input a number to check prime or not: 13
The entered number is a prime number.
 */
import java.util.*;

public class loop5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Input a number to check prime or not: ");
            int numri = input.nextInt();

            int count = 0;
            for (int j = 2; j < numri; j++) {

                if (numri % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0)
                System.out.println("The entered number " + numri + " is a prime number.");
            else
                System.out.println("The entered number " + numri + " is not a prime number");
            System.out.println("________________________________________________________");
        }


    }
}

