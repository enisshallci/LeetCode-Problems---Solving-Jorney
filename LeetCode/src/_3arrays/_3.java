package _3arrays;
/*
    3. Write a C++ program to find the second largest element in an array of integers.
 */
public class _3 {
    public static void main(String[] args) {

        int vargu[] = {1, 17, 3, 6, 7, 8, 2, 1, 12, 1, 3, 4, 55};

        largestSecondElement(vargu);
    }

    private static void largestSecondElement(int[] vargu) {

        if (vargu.length < 2) {
            System.out.println("Invalid Input!");
            return;
        }

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int i = 0; i < vargu.length; i++) {

            if (vargu[i] > first) {
                second = first;
                first = vargu[i];
            }

            else if (vargu[i] > second && vargu[i] != first) {
                second = vargu[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        }else {
            System.out.println("The second largest element is: " + second);
        }

    }
}
