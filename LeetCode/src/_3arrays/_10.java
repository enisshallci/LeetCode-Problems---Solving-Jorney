package _3arrays;
/*
    10. Write a C++ program to find the smallest element missing from a sorted array.
 */
public class _10 {
    public static void main(String[] args) {

        int vargu[] = {0, 1, 3, 4, 5, 6, 7, 8, 10};
        System.out.println(findSmallestMissing(vargu));
    }

    private static int findSmallestMissing(int[] vargu) {

        int missingElement = 0;

        for (int i = 0; i < vargu.length - 1; i++) {
            int c = vargu[i + 1];
            if (c != vargu[i] + 1) {
                missingElement = vargu[i] + 1;
                break;
            }
        }

        return missingElement;
    }

}
