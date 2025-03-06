package _2strings;
/*
14. Write a C++ program to find the numbers in a given string and calculate the sum of all numbers.
Example:
Sample Input: w3resource from 2008
Sample Output: Sum of the numbers: 2011
 */
public class _14Interesting {
    public static void main(String[] args) {

        String input = "wr3esource from 2008";

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);
            if (c >= 48 && c <= 57) {
                int numri = c - 48;
                //loop to find consecutive digits in the String:
                for (int j = i + 1; j < input.length(); j++) {

                    char c1 = input.charAt(j);
                    if (c1 >= 48 && c1 <= 57) {
                        int numri2 = c1 - 48;
                        numri = (numri * 10) + numri2;
                        i = j;
                    }
                    else {
                        break;
                    }
                }

                sum += numri;
            }
        }

        System.out.println(sum);

    }
}
