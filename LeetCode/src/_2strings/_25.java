package _2strings;
import java.util.Scanner;
/*
25. Write a C++ program to find the longest sequence of consecutive ones in a given binary string.
Example:
Original Binary String:
1100110001
Longest sequence of consecutive ones of the said binary string:
11
 */
public class _25 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Original Binary String: ");
        String fjalia = input.nextLine();

        System.out.println("Result -> " + consecutiveOnes(fjalia));
    }

    private static String consecutiveOnes(String fjalia) {

        String max = "";
        for (int i = 0; i < fjalia.length(); i++) {

            char c = fjalia.charAt(i);
            if (c == '1') {
                String ones = "1";
                //check for consecutive 1
                for (int j = i + 1; j < fjalia.length(); j++) {
                    if (fjalia.charAt(j) == '1') {
                        ones += '1';
                        i = j;
                    } else {
                        break;
                    }
                }

                if (ones.length() > max.length()) {
                    max = ones;
                }

            }
        }

        return max;

    }
}

