package _6Recursion;
/*
    6. Write a C++ program to reverse a string using recursion.
 */
public class _6 {
    public static void main(String[] args) {

        String text = "adonnis";

        char[] characters = text.toCharArray();
        reverseString(characters, 0, text.length() - 1);

        String reverseText = new String(characters);
        System.out.println(reverseText);
    }

    private static char[] reverseString (char[] fjala, int start, int end) {

        if (start == end) {
            return null;
        }

        char temp = fjala[start];
        fjala[start] = fjala[end];
        fjala[end] = temp;

        return reverseString(fjala, start + 1, end - 1);
    }
}
