package _3arrays;
import java.util.HashSet;
/*
    21. Write a C++ program to find the elements in a given array of integers that repeat exactly two times.
 */
public class _21 {
    public static void main(String[] args) {
        int[] vargu = {5, 7, 8, 8, 5, 8, 7, 7};

        System.out.println(repeatedNumber(vargu));
    }

    private static int repeatedNumber(int[] vargu) {

        int repeatedNumber = 0;
        for (int i = 0; i < vargu.length; i++) {
            int count = 0;
            for (int j = 0; j < vargu.length; j++) {
                if (vargu[j] == vargu[i]) {
                    count++;
                }
            }
            if (count == 2) {
                repeatedNumber = vargu[i];
                break;
            }
        }

        return repeatedNumber;
    }
}
