package _1loops;
import java.util.Scanner;
/*
84. Write a program in C++ to compute the sum of the digits of an integer using function. Go to the editor
Sample Output:
Input any number: 255 The sum of the digits of the number 255 is: 12
 */
public class loop84 {

    public static int Shuma(int number) {

        int shuma = 0;
        while(number != 0) {

            int mbetja = number % 10;
            shuma += mbetja;
            number /= 10;

        }
        return shuma;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input any number: ");
        int number = input.nextInt();

        System.out.println("The sum of the digits of the number " + number + " is: " + Shuma(number));


    }
}
