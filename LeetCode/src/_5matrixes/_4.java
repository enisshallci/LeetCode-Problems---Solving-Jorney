package _5matrixes;
/*
    Matrica e Transportuar.
 */
public class _4 {
    public static void main(String[] args) {

        int[][] matrix = {{5, 3, 1},
                          {2, 6, 4}};


        int matrixT[][] = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixT[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < matrixT.length; i++) {
            for (int j = 0; j < matrixT[i].length; j++) {
                System.out.print(matrixT[i][j] + " ");
            }
            System.out.println();
        }

    }
}
