package _3arrays;
/*
    27. Write a C++ program to find the number of pairs of integers in a given array of integers
    whose sum is equal to a specified number.
 */
public class _27 {
    public static void main(String[] args) {

        int vargu[] = {1, 5, 7, 5, 8, 9, 11, 12};

        int vlera = 12;

        int count = 0;
        for (int i = 0; i < vargu.length; i++) {

            for (int j = i + 1; j < vargu.length; j++) {
                if (vargu[i] + vargu[j] == vlera) {
                    System.out.println(vargu[i] + ", " + vargu[j]);
                    count++;
                }
            }
        }

        System.out.println("Number of pairs whose sum equal to " + vlera + ": " + count);

    }
}