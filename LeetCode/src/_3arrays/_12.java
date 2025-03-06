package _3arrays;
/*
12. Write a C++ program to rearrange the elements of a given array of integers in a zig-zag pattern.
Note: The format zig-zag array in form a < b > c < d > e < f > g.
 */
public class _12 {
    public static void main(String[] args) {

        int vargu[] = {0, 1, 3, 4, 5, 6, 7, 8, 10};
        updateArray(vargu);
        for (int i : vargu) {
            System.out.print(i + " ");
        }
    }

    private static void updateArray(int[] vargu) {

        boolean ans = true;

        for (int i = 0; i < vargu.length - 1; i++) {

            if (ans) {      //if the pattern is to have the next element greater:
                if (vargu[i + 1] < vargu[i] ) {
                    int temp = vargu[i];
                    vargu[i] = vargu[i + 1];
                    vargu[i + 1] = temp;
                }
            }
            else {      // if the pattern is to have the next element smaller:
                if (vargu[i + 1] > vargu[i]) {
                    int temp = vargu[i];
                    vargu[i] = vargu[i + 1];
                    vargu[i + 1] = temp;
                }
            }

            ans = !ans;
        }

    }
}
