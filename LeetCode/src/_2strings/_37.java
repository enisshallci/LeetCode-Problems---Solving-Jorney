package _2strings;
/*
37. Write a C++ program that counts the number of instances of a certain character in a given string.
Test Data:
("Exercises", "e") -> 2
("Compilation Time", "i") -> 3
 */
public class _37 {
    public static void main(String[] args) {

        System.out.println(countChar("Exercises", 'e'));

    }

    private static String countChar(String fjalia, char karakteri) {

        int count = 0;
        for (int i = 0; i < fjalia.length(); i++) {
            if (fjalia.charAt(i) == karakteri) {
                count++;
            }
        }

        return "(\"" + fjalia + "\", \"" + karakteri + "\") -> " + count;
    }

}
