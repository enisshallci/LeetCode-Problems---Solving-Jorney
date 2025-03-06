package _5matrixes;
/*
    Sum of Row and Column:
 */
public class _6 {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};

        int rowSum;
        for (int i = 0; i < matrix.length; i++) {
            rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.print(rowSum + " ");
        }


        System.out.println();


        int columns = matrix[0].length;
        int rows = matrix.length;

        for (int i = 0; i < columns; i++) {
            int columnSum = 0;
            for (int j = 0; j < rows; j++) {
                columnSum += matrix[j][i];
            }
            System.out.print(columnSum + " ");
        }

    }
}
