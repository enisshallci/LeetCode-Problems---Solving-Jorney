package _3arrays;
/*
    20. Write a C++ program to count the number of occurrences of a given number in a sorted array of integers.
 */
public class _20 {
    public static void main(String[] args) {

        int vargu[] = {5, 7, 8, 8, 5, 8, 7, 7};
        int vlera = 99;
        int count = countOccurence(vargu, vlera);
        System.out.println("Number " + vlera + " appears " + count + " times in the array.");
    }

    private static int countOccurence(int[] vargu, int vlera) {

        int count = 0;
        for (int i = 0; i < vargu.length; i++) {
                if (vargu[i] == vlera) {
                    count++;
            }
        }

        return count;
    }
}
