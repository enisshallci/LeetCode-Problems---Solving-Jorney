package _3arrays;
/*
2. Write a C++ program to find the largest three elements in an array.
 */
public class _2 {
    public static void main(String[] args) {

        int vargu[] = {1, 17, 3, 6, 7, 8, 2, 1, 12, 1, 3, 4, 55};

        largestThreeElements(vargu);

    }

    private static void largestThreeElements(int[] vargu) {

        int first, second, third;
        first = second = third = Integer.MIN_VALUE;

        if (vargu.length < 3) {
            System.out.println("Invalid Input!");
            return;
        }

        for (int i = 0; i < vargu.length; i++) {

            if (vargu[i] > first) {
                third = second;
                second = first;
                first = vargu[i];
            }

            else if (vargu[i] > second) {
                third = second;
                second = vargu[i];
            }

            else if (vargu[i] > third) {
                third = vargu[i];
            }
        }

        System.out.println("Three largest elements are: " + first + ", " + second + ", " + third);

    }
}
