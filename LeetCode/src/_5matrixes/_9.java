package _5matrixes;
/*
    Matrix Multiplication:

    Numri i kolonave te matrices se pare duhet te jete i barabarte me numrin e rreshtave te matrices se dyte.
 */
public class _9 {
    public static void main(String[] args) {

        int[][] matricaA = {{1, 2},
                {3, 4}};

        int[][] matricaB = {{5, 6},
                {7, 8}};


        int rezultati[][] = multiplicateMatrixes(matricaA, matricaB);

        for (int i = 0; i < rezultati.length; i++) {
            for (int j = 0; j < rezultati[i].length; j++) {
                System.out.print(rezultati[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] multiplicateMatrixes(int[][] matricaA, int[][] matricaB) {

        int rowsA = matricaA.length;
        int colsA = matricaA[0].length;
        int rowsB = matricaB.length;
        int colsB = matricaB[0].length;

        //Check the condition:
        if (colsA!= rowsB) {
            System.out.println("Matricat e tilla nuk mund te shumezohen!");
            return null;
        }

        int[][] rezultati = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    rezultati[i][j] += matricaA[i][k] * matricaB[k][j];
                }
            }
        }

        return rezultati;
    }
}
