package _6Recursion;
/*
    1. Write a C++ program to find the sum of all elements in an array using recursion.
 */
public class _1 {
    public static void main(String[] args) {

        int[] vargu = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int shumaEAnetareve = sum(vargu, vargu.length);
        System.out.println(shumaEAnetareve);
    }

    private static int sum(int[] vargu, int size) {

        if (size == 0) {      //base case
            return 0;
        }

        return vargu[size - 1] + sum (vargu, size - 1);     //recursive case
    }

}
