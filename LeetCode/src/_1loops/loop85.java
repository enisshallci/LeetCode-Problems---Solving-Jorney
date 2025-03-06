package _1loops;
import java.util.Scanner;
/*
85. Write a program in C++ to reverse a string. Go to the editor
Sample Output:
Enter a string: w3resource The string in reverse are: ecruoser3w.
 */
public class loop85 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Print the number: ");
        String fjalia = input.nextLine();


        StringBuilder reverseString = new StringBuilder();
        for (int i = fjalia.length() - 1; i >= 0; i--) {

            reverseString.append(fjalia.charAt(i));
        }

        System.out.println(reverseString);

    }
}
