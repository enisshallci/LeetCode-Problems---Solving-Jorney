package _3arrays;
/*
    29. Write a C++ program to find the second lowest and highest numbers in a given array.
 */
public class _29 {
    public static void main(String[] args) {

        int[] vargu1 = {3, 5, 22, 10, 1, 3};

        System.out.println(check(vargu1));
    }

    private static String check(int[] vargu) {

        int firstLowest = Integer.MAX_VALUE, secondLowest = Integer.MAX_VALUE;
        int firstHighest = Integer.MIN_VALUE, secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < vargu.length; i++) {

            //secondLowest
            if (vargu[i] < firstLowest) {
                secondLowest = firstLowest;
                firstLowest = vargu[i];
            }
            else if (vargu[i] < secondLowest && vargu[i] != firstLowest) {
                secondLowest = vargu[i];
            }

            //secondHighest:
            if (vargu[i] > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = vargu[i];
            }
            else if (vargu[i] > secondHighest && vargu[i] != firstHighest) {
                secondHighest = vargu[i];
            }

        }


        return "Second lowest number is " + secondLowest + " and second highest number is " + secondHighest;
    }
}
