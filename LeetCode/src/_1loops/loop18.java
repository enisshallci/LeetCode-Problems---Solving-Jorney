package _1loops;
import java.util.Scanner;
/*
18. Write a program in C++ to display the cube of the number upto given an integer. Go to the editor
Sample Output:
Input the number of terms : 5
Number is : 1 and the cube of 1 is: 1
Number is : 2 and the cube of 2 is: 8
Number is : 3 and the cube of 3 is: 27
Number is : 4 and the cube of 4 is: 64
Number is : 5 and the cube of 5 is: 125
 */
public class loop18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of terms: ");
        int term = input.nextInt();

        nonPrimeNumbers(term);

    }

    private static void nonPrimeNumbers(int term) {

        for (int i = 1; i <= term; i++) {

            System.out.println("Number is: " + i + " and the cube of " + i + " is: " + (i * i * i));
        }

        /*
            Nese dojme me loop me bo fuqine (kubin):

            int fuqia = 1;
            for (int f = 1; f <= 3; f++) {
                fuqia *= i;
            }
         */
    }
}
