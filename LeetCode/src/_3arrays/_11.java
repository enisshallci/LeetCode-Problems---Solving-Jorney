package _3arrays;
/*
    11. Write a C++ program to update every array element by multiplication of the next and previous values of a given
     array of integers.
 */
public class _11 {
    public static void main(String[] args) {

        int vargu[] = {0, 1, 3, 4, 5, 6, 7, 8, 10};
        updateArray(vargu);

        for (int i : vargu) {
            System.out.print(i + " ");
        }
    }

    private static void updateArray(int[] vargu) {

        int prevElement = vargu[0];
        vargu[0] = vargu[0] * vargu[1];

        for (int i = 1; i < vargu.length - 1; i++) {

            int currentElement = vargu[i];
            vargu[i] = prevElement * vargu[i + 1];

            prevElement = currentElement;
        }

        vargu[vargu.length - 1] = prevElement * vargu[vargu.length - 1];
    }
}