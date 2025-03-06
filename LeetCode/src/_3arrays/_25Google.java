package _3arrays;

import java.util.ArrayList;

public class _25Google {
    public static void main(String[] args) {


        int[] vargu1 = {8, 5, 7, 8, 9, 11};
        int[] vargu2 = {6, 8, 10, 11, 12, 16};
        int[] vargu3 = {1, 3, 5, 6, 8, 10, 11, 17};

        System.out.println(commonElements(vargu1, vargu2, vargu3));
    }

    private static ArrayList<Integer> commonElements(int[] vargu1, int[] vargu2, int[] vargu3) {

        ArrayList<Integer> lista = new ArrayList<>();

        int s1 = vargu1.length;
        int s2 = vargu2.length;
        int s3 = vargu3.length;
        int i = 0, j = 0, k = 0;

        while (i < s1 && j < s2 && k < s3) {

            if (vargu1[i] == vargu2[j] && vargu2[j] == vargu3[k]) {
                lista.add(vargu1[i]);
                i++;
                j++;
                k++;
            }

            else if(vargu1[i] < vargu2[j])
                i++;
            else if (vargu2[j] < vargu3[k])
                j++;
            else
                k++;

        }

        return lista;
    }
}
