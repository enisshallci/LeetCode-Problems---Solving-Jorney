package _3arrays;
/*
    7. Write a C++ program to find the most frequent element in an array of integers.
 */
public class _7 {
    public static void main(String[] args) {

        int[] vargu = {4, 45, 9, 12, 9, 22, 45, 7, 45};
        System.out.println(mostFrequentElement(vargu));
    }

    private static int mostFrequentElement(int[] vargu) {

        int maxCount = 0;
        int mostFrequent = 0;
        for (int i = 0; i < vargu.length; i++) {
            int count = 1;
            for (int j = i + 1; j < vargu.length; j++) {
                if (vargu[i] == vargu[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = vargu[i];
            }
        }

        return mostFrequent;
    }
}
