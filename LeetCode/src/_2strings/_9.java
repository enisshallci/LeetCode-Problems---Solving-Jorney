package _2strings;
/*
9. Write a C++ program to check whether two characters appear equally in a given string.
Example:
Sample Input: aabcdeef
Sample Output: True
 */
public class _9 {
    public static void main(String[] args) {

        String teksti = "aabcdeef";

        System.out.println("Sample Output: " + countChars(teksti, 'a', 'e'));
    }

    private static String countChars(String fjalia, char c1, char c2) {

        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < fjalia.length(); i++) {
            char c = fjalia.charAt(i);
            if (c == c1) {
                count1++;
            }
            else if (c == c2) {
                count2++;
            }
        }

        if (count1 == count2) {
            return "True";
        }

        return "False";
    }
}
