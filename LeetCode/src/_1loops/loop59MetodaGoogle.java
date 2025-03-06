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
public class loop59MetodaGoogle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input any number: ");
        String number = input.nextLine();

        for (int i = 0; i <= 9; i++) {

            int count = 0;

            if (i == 0) {       //Per 0 qe jane para numrit.
                for (int z = 0; z < number.length(); z++) {
                    if (number.charAt(z) == '0') {
                        count++;
                    }
                }
            }
            else {
                for (int n = Integer.parseInt(number); n != 0; n /= 10) {
                    int mbetja = n % 10;
                    if (i == mbetja) {
                        count++;
                    }
                }
            }

            System.out.println("The frequency of " + i + " = " + count);
        }
    }
}
