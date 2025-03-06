package _1loops;
/*
8. Write a program in C++ to find the last prime number that occurs before the entered number.
Sample Output:
Input a number to find the last prime number occurs before the number: 50
47 is the last prime number before 50
 */
import java.util.*;

public class loop8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a number to find the last prime number occurs before the number: ");
        int numri = input.nextInt();

        for (int i = numri - 1; i > 1; i--) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i + " is the last prime number before " + numri);
                break;
            }
        }


    }
}