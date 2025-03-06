package _1loops;
import java.util.Scanner;
/*
86. Write a program in C++ to count the letters, spaces, numbers and other characters of an input string. Go to the editor
Sample Output:
Enter a string: This is w3resource.com
The number of characters in the string is: 22
The number of alphabets are: 18
The number of digits are: 1
The number of spaces are: 2
The number of other characters are: 1
 */
public class loop86 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String stringu = input.nextLine();

        int numberOfChars = stringu.length();
        int numberOfAlphabets = 0;
        int numberOfSpaces = 0;
        int otherChars = 0;
        int numberOfDigits = 0;
        for (int i = 0; i < stringu.length(); i++) {
            char c = stringu.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                numberOfAlphabets++;
            else if (c >= '0' && c <= '9')
                numberOfDigits++;
            else if (c == ' ')
                numberOfSpaces++;
            else
                otherChars++;
        }

        System.out.println("The number of characters in the string is: " + numberOfChars);
        System.out.println("The number of alphabets are: " + numberOfAlphabets);
        System.out.println("The number of digits are: " + numberOfDigits);
        System.out.println("The number of spaces are:" + numberOfSpaces);
        System.out.println("The number of other characters are: " + otherChars);
    }
}
