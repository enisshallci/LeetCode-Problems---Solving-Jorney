package _5matrixes;
/*
    3. Count Odd and Even Numbers of matrix
 */
public class _5 {
    public static void main(String[] args) {

        int[][] matrica = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int countEven = 0, countOdd = 0;

        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                if (matrica[i][j] % 2 == 0) {
                    countEven++;
                }
                else {
                    countOdd++;
                }
            }
        }

        System.out.println("Odd: " + countOdd + "\nEven: " + countEven);

    }
}
