package _1loops;
import java.util.Scanner;
/*
82. Write a program in C++ to compare two numbers. Go to the editor
Sample Output:
Input the first integer: 25
Input the second integer: 15
25 != 15
25 > 15
25 >= 15
 */
public class loop82 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the first integer: ");
        int number1 = input.nextInt();
        System.out.print("Input the second integer: ");
        int number2 = input.nextInt();

        if (number1 != number2) {
            System.out.println(number1 + " != " + number2);
            if (number1 >= number2) {
                System.out.println(number1 + " > " + number2);
                System.out.println(number1 + " >= " + number2);
            } else {
                System.out.println(number1 + " < " + number2);
                System.out.println(number1 + " <= " + number2);
            }
        }
        else {
            System.out.println(number1 + " == " + number2);
            System.out.println(number1 + " >= " + number2);
            System.out.println(number1 + " <= " + number2);
        }

    }
}
