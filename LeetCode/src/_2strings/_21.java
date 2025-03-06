package _2strings;
import java.util.Scanner;
/*
21. Write a C++ program to check whether a given string is a subsequence of another given string. Return 1 for true and 0 for false.
Example:
word1: apple
subse1: apl
Is subse1 is the subsequence of word1? 1
word2: apple
subse2: ppe
Is subse2 is the subsequence of word2? 1
word3: ACGGTGTCGTGCTATGCTGATGCTGACTTATATGCTA
subse3: CGTTCGGCTATGCTTCTACTTATTCTA
Is subse3 is the subsequence of word3? 1
word4: CGTTCGGCTATCGTACGTTCTATTCTATGATTTCTAA
subse4: CGTTCGGCTATGCZTTCTACTTATTCTA
Is subse4 is the subsequence of word4? 0
 */
public class _21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the word: ");
        String word = input.nextLine();
        System.out.print("Input the subsequence: ");
        String subs = input.nextLine();

        System.out.println(checkSubsequence(word, subs));
    }

    private static boolean checkSubsequence(String word, String subs) {

        int temp = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == subs.charAt(temp)) {
                temp++;
            }

            if (temp == subs.length()) {
                return true;
            }
        }

        return false;
    }
}
