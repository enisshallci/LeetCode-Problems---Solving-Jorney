package _2strings;
/*
31. Write a C++ program to check if a given string contains only uppercase or only lowercase letters.
 Return "True" if the string is uppercase or lowercase, otherwise "False".
Example:
Original string: ABCDEF
Check whether the said string is uppercase or lowercase: True
 */
public class _31 {
    public static void main(String[] args) {

        String string = "ABCDEF";

        boolean flag = true;
        for (int i = 0; i < string.length(); i++) {

            if (Character.isUpperCase(string.charAt(0)) != Character.isUpperCase(string.charAt(i))) {
                flag = false;
                break;
            }
        }

        System.out.println("Check whether the said string is uppercase or lowercase: " + flag);

    }
}
