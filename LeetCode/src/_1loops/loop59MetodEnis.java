package _1loops;
import java.util.Scanner;
/*
59. Write a program in C++ to find the frequency of each digit in a given integer. Go to the editor
Sample Output:
Input any number: 122345
The frequency of 0 = 0
The frequency of 1 = 1
The frequency of 2 = 2
The frequency of 3 = 1
The frequency of 4 = 1
The frequency of 5 = 1
The frequency of 6 = 0
The frequency of 7 = 0
The frequency of 8 = 0
The frequency of 9 = 0
 */
public class loop59MetodEnis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input any number: ");
        int number = input.nextInt();

        for (int i = 0; i < 10; i++) {
            int count = 0;
            System.out.print("The frequency of " + i + " = ");
            int numri = number;

            for (int j = 0; j < Integer.toString(number).length(); j++) {

                int r = numri % 10;
                if (i == r) {
                    count++;
                }

                numri /= 10;
            }

            System.out.println(count);
        }


    }
}
