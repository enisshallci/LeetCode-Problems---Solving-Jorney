package _2strings;
/*
42. Write a C++ program that alternates the case of each letter in a given string of letters.
Pattern: First lowercase letter then uppercase letter and so on.
Test Data:
("JavaScript") -> "jAvAsCrIpT"
("Python") -> "pYtHoN"
("C++") -> "c++"
 */
public class _42 {
    public static void main(String[] args) {

        String fjalia = "pYtHoN";

        fjalia = fjalia.toLowerCase();

        String fjaliaRe = "";
        for (int i = 0; i < fjalia.length(); i++) {

            char c = fjalia.charAt(i);
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                if (i % 2 == 1) {
                    fjaliaRe += (char) (c - 32);
                } else {
                    fjaliaRe += c;
                }
            } else {
                fjaliaRe += c;
            }
        }

        System.out.println(fjaliaRe);

    }
}
