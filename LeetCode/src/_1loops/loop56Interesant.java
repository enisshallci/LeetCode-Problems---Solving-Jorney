package _1loops;
import java.util.Scanner;
/*
56. Write a program in C++ to find the first and last digit of a number. Go to the editor
Sample Output:
Input any number: 5679
The first digit of 5679 is: 5
The last digit of 5679 is: 9
 */
public class loop56Interesant {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input any number: ");
        int number = input.nextInt();

        int shifraPare;
        int shifraFundit = number % 10;
        int count = 1;

        for (shifraPare = number; shifraPare >= 10; shifraPare = shifraPare / 10) {  //Loop to find the first digit.
            count++;
        }

        System.out.println("The first digit of " + number + " is: " + shifraPare);
        System.out.println("The last digit of " + number + " is: " + shifraFundit);
        System.out.println("The sum of first and last digit of " + number + " is " + (shifraFundit + shifraPare));
        System.out.println("The number of digits of the " + number + " is: " + count);

    }
}
