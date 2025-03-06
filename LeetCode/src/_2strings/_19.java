package _2strings;
import java.util.ArrayList;
import java.util.Scanner;

/*
19. Write a C++ program to reverse only the vowels of a given string.
A vowel is a syllabic speech sound pronounced without any stricture in the vocal tract.
Vowels are one of the two principal classes of speech sounds, the other being the consonant.
Example:
Original string: w3resource
After reversing the vowels of the said string: w3resuorce
Original string: Python
After reversing the vowels of the said string: Python
Original string: Hello
After reversing the vowels of the said string: Holle
Original string: USA
After reversing the vowels of the said string: ASU
 */
public class _19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a sentence (string): ");
        String fjala = input.nextLine();


        System.out.println("Result -> " + reverseVowels(fjala));
    }

    private static String reverseVowels(String fjala) {

        ArrayList<Character> lista = new ArrayList<>();
        for (int i = fjala.length() - 1; i >= 0; i--) {

            char c = fjala.charAt(i);
            switch(c) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> lista.add(c);
            }
        }

        if (lista.size() < 1) {
            return fjala;
        }

        String fjalaRe = "";
        int temp = 0;
        for (int i = 0; i < fjala.length(); i++) {

            char c = fjala.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                fjalaRe += lista.get(temp++);
            }
            else {
                fjalaRe += c;
            }
        }

        return fjalaRe;
    }
}
