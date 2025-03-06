package _3arrays;

import java.util.HashSet;
/*
    6. Write a C++ program to find all elements in an array of integers that have at least two greater elements:.
 */
public class _6 {
    public static void main(String[] args) {

        int vargu[] = {7, 8, 6, 3, 2, 1};;
        HashSet<Integer> set = findGreaterElements(vargu);
        for (int i : set) {
            System.out.print(i + " ");
        }
    }

    private static HashSet<Integer> findGreaterElements(int[] vargu) {

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < vargu.length; i++) {
            int count = 0;
            for (int j = 0; j < vargu.length; j++) {
                if (vargu[j] > vargu[i]) {
                    count++;
                }
                if (count >= 2) {
                    hashSet.add(vargu[i]);
                    break;
                }
            }
        }
        return hashSet;
    }
}