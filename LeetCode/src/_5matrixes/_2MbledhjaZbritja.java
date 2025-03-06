package _5matrixes;
/*
    Mbledhja ose zbritja e matricave:
 */
public class _2MbledhjaZbritja {
    public static void main(String[] args) {

        int[][] matrica1 = { { 1, 2, 3},
                {5, 6, 6 },
                {3, 8, 9}};


        int[][] matrica2 = { { 7, 2, 1},
                {3, 1, 2 },
                {3, 0, -3}};

        //Dy matrica munden me u mbledhe nese kane numer te njejte te rreshtave dhe kolonave:
        int matrica3[][] = new int[matrica1.length][matrica1.length];

        for (int i = 0; i < matrica1.length; i++) {
            for (int j = 0; j < matrica1[i].length; j++) {
                matrica3[i][j] = matrica1[i][j] + matrica2[i][j];
            }
        }

        //shtypja e elementeve:
        for (int i = 0; i < matrica3.length; i++) {
            for (int j = 0; j < matrica3[i].length; j++) {
                System.out.print(matrica3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
