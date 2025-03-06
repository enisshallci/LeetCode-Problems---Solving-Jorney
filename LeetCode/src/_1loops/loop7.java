package _1loops;
import java.util.Scanner;
/*
7. Write a program in C++ to find the factorial of a number. Go to the editor
Sample output:
Input a number to find the factorial: 5
The factorial of the given number is: 120
 */
public class loop7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number to find the factorial: ");
        int numri = input.nextInt();
        int faktorieli = 1;

        
          for (int i = numri; i > 1; i--) {
              faktorieli *= i;
           }

        System.out.print("The factorial of the given number is: " + faktorieli);

    }
}
