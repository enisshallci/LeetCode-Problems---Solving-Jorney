package _2strings;
/*
36. Write a C++ program to check whether there are two consecutive (following each other continuously),
identical letters in a given string.
Test Data:
("Exercises") -> 0
("Yellow") -> 1

UNE po e boj nese jon dy shkronja qe perseriten bone me kthy 2, nese jon 3 bone me kthy 3 ...
 */
public class _36 {
    public static void main(String[] args) {

        String text = "Yelloo";
        System.out.println("(\"" + text + "\") -> " + checkConsecutive(text));
    }

    private static int checkConsecutive(String fjalia) {

        int count = 0;
        for (int i = 0; i < fjalia.length() - 1; i++) {

            char c = fjalia.charAt(i);
            if (fjalia.charAt(i + 1) == c) {
                count++;
                i++;
            }
        }

        return count;
    }
}
