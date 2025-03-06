package _1loops;
import java.util.Scanner;
/*
62. Write a program in C++ to find power of any number using for loop. Go to the editor
Sample Output:
Input the base: 2
Input the exponent: 5
2 ^ 5 = 32
 */
public class loop62 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the base: ");
        int base = input.nextInt();
        System.out.print("Input the exponent: ");
        int exponent = input.nextInt();

        int power = findPower(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + power);
    }

    private static int findPower(int base, int exponent) {

        int power = 1;
        for (int i = 1; i <= exponent; i++) {

            power *= base;
        }

        return power;
    }
}
