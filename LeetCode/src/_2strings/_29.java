package _2strings;
/*
29. Write a C++ program to print a given integer with commas separating the thousands.
Example:
Input a number:
Print the said integer with commas as thousands separators:
5,000
 */
public class _29 {
    public static void main(String[] args) {

        String number = "5000";
        String newNumber = "";

        int count = 0;
        for (int i = number.length() - 1; i >= 0; i--) {

            newNumber = number.charAt(i) + newNumber;
            count++;
            if (count == 3) {
                newNumber = "," + newNumber;
                count = 0;
            }
        }

        System.out.println(newNumber);
    }
}
