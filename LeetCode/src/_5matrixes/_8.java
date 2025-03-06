package _5matrixes;
/*
    7. Find Maximum and Minimum in a Matrix
 */
public class _8 {
    public static void main(String[] args) {

        int[][] matrica = {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                if (matrica[i][j] > max) {
                    max = matrica[i][j];
                }
                if (matrica[i][j] < min) {
                    min = matrica[i][j];
                }
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
