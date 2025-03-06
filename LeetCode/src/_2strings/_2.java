package _2strings;

import java.util.Scanner;

/*
2. Write a C++ program to change every letter in a given string with the letter following it in the alphabet
(i.e. a becomes b, p becomes q, z becomes a).
Example:
Sample Input: w3resource
Sample Output: x3sftpvsdf
 */
public class _2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Please type a word: ");
        String fjala = input.nextLine();

        String fjalaRe = "";
        for (int i = 0; i < fjala.length(); i++) {

            char c = fjala.charAt(i);
            if (c == 'Z') {
                fjalaRe += 'A';
            } else if (c == 'z') {
                fjalaRe += 'a';
            } else if ((c >= 65 && c < 90) || (c >= 97 && c < 122)) {
                fjalaRe += (char) (c + 1);
            } else
                fjalaRe += c;
        }

        System.out.println("Sample Output: " + fjalaRe);
    }
}
