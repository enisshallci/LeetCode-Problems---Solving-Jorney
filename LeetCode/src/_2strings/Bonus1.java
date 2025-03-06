package _2strings;

public class Bonus1 {
    public static void main(String[] args) {
        String text = "Total number of unique characters of the said two strings ";

        text = text.toLowerCase();

        char[] keys = new char[26];
        int temp = 0;
        for (int i = 97; i <= 122; i++) {
            keys[temp++] = (char) i;
        }

        int[] values = new int[26];

        for (int i = 0; i < text.length(); i++) {

            char c = text.charAt(i);
            for (int j = 0; j < keys.length; j++) {
                if (c == keys[j]) {
                    values[j] += 1;
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.println(keys[i] + " -> " + values[i]);
        }
    }
}
