package _2strings;
/*
13. Write a C++ program to change the case (lower to upper and upper to lower cases) of each character in a given string.
Example:
Sample Input: Python
Sample Output: pYTHON
 */
public class _13 {
    public static void main(String[] args) {

        String text = "Pyth_On";
        String newText = "";

        for (int i = 0; i < text.length(); i++) {

            char c = text.charAt(i);
            if (c >= 65 && c <= 90) {
                newText += (char) (c + 32);
            }
            else if (c >= 98 && c <= 122) {
                newText += (char) (c - 32);
            }
            else {
                newText += c;       //Nese ka karaktere tjera veq bashkangjitja.
            }
        }

        System.out.println("Input: " + text);
        System.out.println("Output: " + newText);

    }
}
