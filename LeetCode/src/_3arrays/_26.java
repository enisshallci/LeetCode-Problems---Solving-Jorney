package _3arrays;
/*
    26. Write a C++ program to find and print all distinct elements of a given array of integers.
*/
public class _26 {
    public static void main(String[] args) {

        int[] vargu = {1, 5, 7, 5, 8, 9, 11, 11, 2, 5, 11, 6};

        for (int i = 0; i < vargu.length; i++) {
            int j;
            for (j = 0; j < i; j++) {

                if (vargu[i] == vargu[j]) {
                    break;
                }
            }

            if (i == j) {
                System.out.print(vargu[i] + " ");
            }
        }

    }
}
