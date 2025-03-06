package _5matrixes;
/*
    Printimi i elementeve te matrices:
 */
public class _1Hyrje {
    public static void main(String[] args) {

        int[][] matrix = {{5, 3, 1},
                {5, 3, 1},
                {2, 2, 4}};


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
