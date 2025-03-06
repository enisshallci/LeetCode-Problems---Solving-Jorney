package _2strings;
/*
23. Write a C++ program that counts the number of unique characters in two given strings.
Example:
Original Strings:
String1: Pythonn
String2: Java
Total number of unique characters of the said two strings: 9
 */
public class _23 {
    public static void main(String[] args) {

        String string1 = "Python";
        String string2 = "Java";

        String newString = string1 + string2;

        System.out.println(newString);

        String result = "";
        for (int i = 0; i < newString.length(); i++) {

            boolean isDuplicate = false;

            char c = newString.charAt(i);
            for (int j = 0; j < result.length(); j++) {

                if (c == result.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {     // perderisa isDuplicate eshte false:
                result += c;
            }
        }

        System.out.println(result + " , " + result.length());

    }
}
