package _3arrays;
/*
14. Write a C++ program to separate 0s and 1s from a given array of values 0 and 1.

 */
public class _14 {
    public static void main(String[] args) {

        int[] vargu = {0, 1, 0, 0 , 1, 1, 1, 0, 1, 0};
        segregateEvenOdd(vargu);

        for (int i : vargu) {
            System.out.print(i + " ");
        }

    }

    private static void segregateEvenOdd(int[] vargu) {

        int count = 0;
        for (int i = 0; i < vargu.length; i++) {
            if (vargu[i] == 0) {
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            vargu[i] = 0;
        }

        for (int i = count; i < vargu.length; i++) {
            vargu[i] = 1;
        }
    }
}
