package _3arrays;

import java.util.Arrays;

/*
    28. Write a C++ program to arrange the numbers in a given array in a way that the
    sum of some numbers equals the largest number in the array.
 */
public class _28 {
    public static void main(String[] args) {

        int[] vargu1 = {3, 5, 22, 10, 1, 3};


        System.out.println(check(vargu1));
    }

    private static boolean check(int[] vargu) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < vargu.length; i++) {
            if (vargu[i] > max) {
                max = vargu[i];
            }
        }

        int sum = 0;
        for (int i = 0; i < vargu.length; i++) {
            if (vargu[i] != max) {
                sum += vargu[i];
            }
        }

        if (sum == max)
            return true;

        return false;
    }
}
