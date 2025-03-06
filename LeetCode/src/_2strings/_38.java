package _2strings;
/*
38. Write a C++ program that removes a specific character from a given string. Return the updated string.
Test Data:
("Filename", "e") -> "Filnam"
("Compilation Time", "i") -> "Complaton Tme"
 */
public class _38 {
    public static void main(String[] args) {

        String text = "Filename";
        System.out.println(removeChar(text, 'e'));
    }

    private static String removeChar(String fjalia, char c) {

        String fjaliaRe = "";
        for (int i = 0; i < fjalia.length(); i++) {

            char karakteri = fjalia.charAt(i);
            if (!(karakteri == c)) {
                fjaliaRe += karakteri;
            }
        }

        return fjaliaRe;
    }
}
