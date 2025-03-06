package _3arrays;
/*
1. Write a C++ program to find the largest element of a given array of integers.
 */
public class _1 {
    public static void main(String[] args) {

        int[] vargu = {5, 4, 9, 12, 8};

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < vargu.length; i++) {
            if (vargu[i] > max) {
                max = vargu[i];
            }
        }

        System.out.println("Largest element of the array: " + max);
    }
}
