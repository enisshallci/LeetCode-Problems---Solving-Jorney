package _1loops;
import java.util.Scanner;
/*
33. Write a program in C++ to Check Whether a Number can be Express as Sum of Two Prime Numbers. Go to the editor
Sample Output:
Input a positive integer: 20
20 = 3 + 17
20 = 7 + 13
 */
public class loop33_Interesant {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int start = input.nextInt();

        checkNumber(start);
    }

    private static void checkNumber(int number) {

        boolean flag1, flag2;
        boolean flag3 = false;
        for (int i = 2; i <= number / 2; i++) {

            flag1 = true;
            flag2 = true;

            //check if "i" is prime number:
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag1 = false;
                    break;
                }
            }

            if (!flag1) {
                continue;
            }

            //check if "number - i" is prime number:
            for (int j = 2; j < number - i; j++) {
                if ((number - i) % j == 0) {
                    flag2 = false;
                    break;
                }
            }

            if (flag1 && flag2) {
                System.out.println(number + " = " + i  + " + " + (number - i));
                flag3 = true;
            }
        }
        if (!flag3) {
            System.out.println(number + " can not be expressed as sum of two prime numbers.");
        }
    }
}

/*
Why Stop at n/2?

    Beyond n/2, the roles of i and n−i would simply reverse.
       Example:

          If n=10 means that n / 2 = 5:

          Pair i=3,n−i=7 is the same as i=7,n−i=3.

    This symmetry means you don’t need to check beyond i=n/2, as all valid pairs have already been covered.
 */
