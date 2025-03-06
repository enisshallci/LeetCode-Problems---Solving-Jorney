package _2strings;
import java.util.Scanner;
/*
20. Write a C++ program to find the length of the longest palindrome in a given string (uppercase or lowercase letters).
Original string: adcdcdy
Length of the longest palindrome of the said string: 5
Original string: aaa
Length of the longest palindrome of the said string: 3
Original string: aa
Length of the longest palindrome of the said string: 2
Original string: abddddeeff
Length of the longest palindrome of the said string: 4
Original string: PYTHON
Length of the longest palindrome of the said string: 1
*/
public class _20Interesting {
    public static void main(String[] args) {

        //CKA e ka caktu Allahu do te ndodhe, mos u lodhë

        Scanner input = new Scanner(System.in);
        System.out.print("Input a String: ");
        String fjalia = input.nextLine();

        String longestPalindrome = "";
        int max = 1;
        for (int i = 0; i < fjalia.length() - 1; i++) {
            String word = "";
            word += fjalia.charAt(i);
            for (int j = i + 1; j < fjalia.length(); j++) {
                word += fjalia.charAt(j);
                if (checkPalindrome(word)) {
                    if (word.length() > max) {
                        max = word.length();
                        longestPalindrome = word;
                    }
                }
            }
        }

        if (max == 1) {
            System.out.println("The longest palindrome in the given string are just single characters: ");
            for (int i = 0; i < fjalia.length(); i++) {
                System.out.print(fjalia.charAt(i) + ", ");
            }
        }
        else
            System.out.println(longestPalindrome);
    }

    private static boolean checkPalindrome(String word) {

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
