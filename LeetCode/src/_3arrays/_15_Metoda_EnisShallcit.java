package _3arrays;

public class _15_Metoda_EnisShallcit {
    public static void main(String[] args) {

        int vargu[] = {10, 1, 2, 5, 3, 4, 7};

        updateArray(vargu);
        for (int i : vargu) {
            System.out.print(i + " ");
        }
    }

    private static void updateArray(int[] vargu) {

        sortArray(vargu);

        for (int i = 0; i < vargu.length - 2; i += 2) {

            int last = vargu[vargu.length - 1];

            //shift elements to the right starting:
            for (int j = vargu.length - 1; j > i; j--) {
                vargu[j] = vargu[j - 1];
            }

            vargu[i] = last;
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
