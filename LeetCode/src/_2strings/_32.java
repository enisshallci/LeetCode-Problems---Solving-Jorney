package _2strings;
import java.util.Arrays;
/*
32. Write a C++ program that takes a string and reverses the words of three or
more lengths in a string. Return the updated string. As input characters, only spaces and letters are permitted.
Example:
Original string: The quick brown fox jumps over the lazy
Reverse the words of three or more lengths of the said string:
ehT kciuq nworb xof spmuj revo eht yzal
 */
public class _32 {
    public static void main(String[] args) {

        String text = "The quick brown fox jumps";

        String[] vargu = text.split(" ");

        for (int i = 0; i < vargu.length; i++) {
            String elementi = "";
            for (int j = vargu[i].length() - 1; j >= 0; j--) {
                elementi += vargu[i].charAt(j);
            }
            vargu[i] = elementi;
        }

        String fjaliaRe = "";
        for (String s : vargu) {
            fjaliaRe += s + " ";
        }

        System.out.println(fjaliaRe);
    }
}
