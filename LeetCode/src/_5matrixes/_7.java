package _5matrixes;
/*
   Print the elements on both the main diagonal (i=j, i=j) and the secondary diagonal (i+j=n−1i+j=n−1).
 */
public class _7 {
    public static void main(String[] args) {

        int[][] matrica = {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};

        //print secondary diagonal elements:
        int n = matrica.length;
        for (int i = 0; i < n; i++) {
            System.out.print(matrica[i][n - 1 - i] + " ");
        }

    }
}
