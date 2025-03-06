package _3arrays;
/*
    9. Write a C++ program to sort a given unsorted array of integers, in wave form.
    Note: An array is in wave form when array[0] >= array[1] <= array[2] >= array[3] <= array[4] >=
 */
public class _9 {
    public static void main(String[] args) {

        int[] vargu = {4, 5, 9, 12, 9, 22, 45, 7};
        waveForm(vargu);

        for (int i : vargu) {
            System.out.print(i + " ");
        }
    }

    private static void waveForm(int[] vargu) {

        sortArray(vargu);
        for (int i = 0; i < vargu.length - 1; i += 2) {
            int temp = vargu[i];
            vargu[i] = vargu[i + 1];
            vargu[i + 1] = temp;
        }

    }

    private static void sortArray(int[] vargu) {

        for (int i = 0; i < vargu.length - 1; i++) {
            for (int j = 0; j < vargu.length - 1 - i; j++) {
                if (vargu[j] > vargu[j + 1]) {
                    int temp = vargu[j];
                    vargu[j] = vargu[j + 1];
                    vargu[j + 1] = temp;
                }
            }
        }

    }
}
