package _3arrays;
/*
    23. Write a C++ program to find the element that appears once in an array of integers and every other element appears twice.
 */
public class _23 {
    public static void main(String[] args) {

        int vargu[] = {1, 5, 1, 5, 3, 7, 9, 7, 9};

        int result = 0;
        for (int i = 0; i < vargu.length; i++) {
            result = result ^ vargu[i];
        }

        System.out.println(result);
    }
}
