package _2strings;
/*
5. Write a C++ program to sort characters (numbers and punctuation symbols are not included) in a string.
Example:
Sample Input: python
Sample Output: hnopty
 */
public class _5 {
    public static void main(String[] args) {

        String fjalia = "python";
        char[] karakteret = fjalia.toCharArray();

        System.out.println(bubbleSort(karakteret));
    }

    private static String bubbleSort(char[] vargu) {

        for (int i = 0; i < vargu.length; i++) {
            for (int j = 0; j < vargu.length - 1 - i; j++) {
                if (vargu[j] > vargu[j + 1]) {
                    char temp = vargu[j];
                    vargu[j] = vargu[j + 1];
                    vargu[j + 1] = temp;
                }
            }
        }


        return new String(vargu);
    }
}
