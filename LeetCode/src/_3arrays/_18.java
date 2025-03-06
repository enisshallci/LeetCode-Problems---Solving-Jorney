package _3arrays;
/*
    18. Write a C++ program to move all negative elements of an array of integers to the end of the array.
     This is done without changing the order of the positive and negative elements of the array.
 */
public class _18 {
    public static void main(String[] args) {

        int[] vargu = {0, 9, -7, 2, -12, 11, -20};
        rearrangeArray(vargu);

        for (int i : vargu) {
            System.out.print(i + " ");
        }
    }

    private static void rearrangeArray(int[] vargu) {

        int[] rezultati = new int[vargu.length];
        int temp = 0;
        for (int i = 0; i < vargu.length; i++) {
            if (vargu[i] >= 0) {
                rezultati[temp++] = vargu[i];
            }
        }

        //Ose i ka te gjitha negative ose i ka te gjitha pozitive
        if (temp == 0 || temp == vargu.length) {
            return;
        }

        for (int i = 0; i < vargu.length; i++) {
            if (vargu[i] < 0) {
                rezultati[temp++] = vargu[i];
            }
        }

        for (int i = 0; i < rezultati.length; i++) {
            vargu[i] = rezultati[i];
        }

    }

}
