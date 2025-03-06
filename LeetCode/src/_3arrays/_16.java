package _3arrays;
/*
    16. Write a C++ program to sort a given array of 0s, 1s and 2s. In the final array put all 0s first,
    then all 1s and all 2s last.
 */
public class _16 {
    public static void main(String[] args) {

        int[] vargu = {0, 1, 2, 2, 1, 1, 0, 0, 1};

        sortNum(vargu);
        for (int i : vargu) {
            System.out.print(i + " ");
        }
    }

    private static void sortNum(int[] vargu) {

        int i = 0;
        int j = vargu.length - 1;
        int mid = 0;

        while (mid <= j) {

            switch(vargu[mid]) {
                case 0:
                    int temp = vargu[i];
                    vargu[i] = vargu[mid];
                    vargu[mid] = temp;
                    mid++;
                    i++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp2 = vargu[mid];
                    vargu[mid] = vargu[j];
                    vargu[j] = temp2;
                    j--;
                    break;
            }
        }

    }
}
