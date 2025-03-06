package _1loops;
import java.util.Scanner;
/*
3. Write a program in Java to display n terms of natural number and their sum. Go to the editor
Sample Output:
Input a number of terms: 7
The natural numbers upto 7th terms are:
1 2 3 4 5 6 7
The sum of the natural numbers is: 28
 */
public class loop3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a number of terms: ");
        int numri = input.nextInt();

        int sum = 0;
        System.out.println("The natural numbers upto " + numri + "th terms are: ");
        for (int i = 1; i <= numri; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nThe sum of the natural numbers is: " + sum);

    }
}
