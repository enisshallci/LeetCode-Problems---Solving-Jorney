package _3arrays;

import java.util.TreeMap;

/*
    17. Write a C++ program to sort (in descending order) an array of distinct elements according
    to the absolute difference of array elements and with a given value.
 */
public class _17 {
    public static void main(String[] args) {

        int[] vargu = {0, 9, 7, 2, 12, 11, 20};
        int x = 12;

        rearrangeArray(vargu,x);

    }

    private static void rearrangeArray(int[] vargu, int vlera) {

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < vargu.length; i++) {
            map.put(Math.abs(vargu[i] - vlera), vargu[i]);
        }

        int[] keys = new int[map.size()];
        int temp = 0;
        for (int i : map.keySet()) {
            keys[temp++] = i;
        }
        bubleSort(keys);

        for (int i : keys) {
            System.out.print(map.get(i) + " ");
        }

    }

    private static void bubleSort(int[] vargu) {

        for (int i = 0; i < vargu.length - 1; i++) {
            for (int j = 0; j < vargu.length - 1 - i; j++) {
                if (vargu[j] < vargu[j + 1]) {
                    int temp = vargu[j];
                    vargu[j] = vargu[j + 1];
                    vargu[j + 1] = temp;
                }
            }
        }
    }

}

/*
    HashMap eshte unordered.
    LinkedHashMap eshte ordered.
 */