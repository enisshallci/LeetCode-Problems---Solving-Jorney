package _5matrixes;
/*
    Mbledhi elementet e matrices qe gjenden mbi diagonale:
 */
public class _3 {
    public static void main(String[] args) {

        int[][] matrica = {{1, 3, 5},
                {6, 6, 3},
                {1, 0, 4}};

        int sum = 0;
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                if (i < j) {
                    sum += matrica[i][j];
                }
            }
        }

        System.out.println(sum);

    }
}
