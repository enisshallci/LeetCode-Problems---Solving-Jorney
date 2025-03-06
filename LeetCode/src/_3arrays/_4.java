package _3arrays;
/*
    4. Write a C++ program to find the k largest elements in a given array of integers.
 */
public class _4 {
    public static void main(String[] args) {

        int[] vargu = {7, 12, 9, 15, 19, 32, 56, 70, 70};

        int[] results = kLargestElements(vargu, 5);
        for (int i : results) {
            System.out.print(i + " ");
        }
    }

    private static int[] kLargestElements(int[] vargu, int k) {

        int[] kElements = new int[k];
        bubbleSort(vargu);

        for (int i = 0; i < k; i++) {
            kElements[i] = vargu[i];
        }

        return kElements;
    }

    private static void bubbleSort(int[] vargu) {

        for (int i = 0; i < vargu.length - 1; i++) {
            for (int j = 0; j < vargu.length - 1 - i; j++) {
                if (vargu[j] < vargu[j + 1]) {
                    int temp = vargu[j];
                    vargu[j] = vargu[j + 1];
                    vargu[j + 1] = temp;
                }
            }
        }
    }
}
