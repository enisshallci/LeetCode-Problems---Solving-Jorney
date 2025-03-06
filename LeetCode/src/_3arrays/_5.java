package _3arrays;
/*
    5. Write a C++ program to find the second smallest element in a given array of integers.
 */
public class _5 {
    public static void main(String[] args) {

        int vargu[] = {1, 17, 3, 6, 7, 8, 2, 1, 12, 1, 3, 4, 55};

        secondSmallestElement(vargu);
    }

    private static void secondSmallestElement(int[] vargu) {

        int firstSmallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        if (vargu.length < 2) {
            System.out.println("Invalid Input!");
            return;
        }

        for (int i = 0; i < vargu.length; i++) {

            if (vargu[i] < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = vargu[i];
            }

            if (vargu[i] < secondSmallest && vargu[i] != firstSmallest) {
                secondSmallest = vargu[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element");
        } else {
            System.out.println("Second smallest element is: " + secondSmallest);
        }

    }
}
