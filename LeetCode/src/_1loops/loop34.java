package _1loops;
import java.util.Scanner;
/*
34. Write a program in C++ to find the length of a string without using the library function. Go to the editor
Sample Output:
Input a string: w3resource.com
The string contains 14 number of characters.
So, the length of the string w3resource.com is:14
 */
public class loop34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String string = input.nextLine();

        System.out.println("So, the length of the string " + string + " is: " + numberOfChars(string));
    }

    private static int numberOfChars(String fjalia) {

        char[] karakteret = fjalia.toCharArray();

        int count = 0;
        for (char c : karakteret) {     //for-each loop -> iteron neper te gjitha elementet.
            count++;
        }

        return count;
    }
}
