package _7DetyraTeNdryshme;
/*
    Gjeje vleren mesatare te numrave mbi dhe nen diagonale, ne nje matrice 3x3;
 */
public class _2 {
    public static void main(String[] args) {

        int[][] matrica = {
                {1, 2, 4},
                {3, 4, 6},
                {7, 8, 9}};

        double sum = 0;
        int count = 0;
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                if (j >= i) {
                    System.out.print(matrica[i][j]);
                }
            }
        }

        double mesatarja = sum / count;
        System.out.println("Vlera mesatare: " + mesatarja);
    }
}
