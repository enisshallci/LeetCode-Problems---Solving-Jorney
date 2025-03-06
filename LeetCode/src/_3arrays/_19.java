package _3arrays;
/*
    19. Write a C++ program to find a number that occurs an odd number of times in a given array of positive integers.
    In the array, all numbers occur an even number of times.
 */
public class _19 {
    public static void main(String[] args) {

        int vargu[] = {5, 7, 8, 8, 5, 8, 7, 7};

        int number = getOddOccurrence(vargu);
        if (number == -1) {
            System.out.println("There is no number that occurs an odd number of times");
        } else {
            System.out.println("Number wich occurs odd number of times: " + number);
        }
    }

    private static int getOddOccurrence(int[] vargu) {

        for (int i = 0; i < vargu.length; i++) {
            int count = 0;
            for (int j = 0; j < vargu.length; j++) {
                if (vargu[i] == vargu[j]) {
                    count++;
                }
            }
            if (count % 2 == 1) {
                return vargu[i];
            }
        }

        return -1;
    }
}
