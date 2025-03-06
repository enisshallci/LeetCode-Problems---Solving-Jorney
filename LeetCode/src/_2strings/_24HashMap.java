package _2strings;
import java.util.HashMap;
/*
24. Write a C++ program to count the number of duplicate characters in a given string.
Example:
Original String: Total number of unique characters of the said two strings.
Number of duplicate characters in the said string: 26
 */
public class _24HashMap {
    public static void main(String[] args) {

        String text = "Total number of unique characters of the said two strings ";

        //Nese eshte case-insensitive
        text = text.toLowerCase();

        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {

            char c = text.charAt(i);

            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        System.out.println(charCountMap);
        int count = 0;
        for (int k : charCountMap.values()) {
            if (k != 1) {
                count++;
            }
        }

        System.out.println("Number of duplicate characters in the said string: " + count);
    }
}
