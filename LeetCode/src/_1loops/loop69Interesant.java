package _1loops;

import java.util.Scanner;
/*
69. Write a program in C++ to produce a square matrix with 0's down the main diagonal, 1's in the entries just above and below the main diagonal, 2's above and below that, etc. Go to the editor
0 1 2 3 4
1 0 1 2 3
2 1 0 1 2
3 2 1 0 1
4 3 2 1 0
Sample Output:
 */
public class loop69Interesant {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input any number: ");
        String number = input.nextLine();

        int numri = Integer.parseInt(number);

        for (int i = 0; i < numri; i++) {

            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }

            for (int k = 1; k < numri - i; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }

    }
}
