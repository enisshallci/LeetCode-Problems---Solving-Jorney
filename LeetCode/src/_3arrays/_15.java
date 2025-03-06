package _3arrays;
/*
    15. Write a C++ program to rearrange a given sorted array of positive integers .
Note: In final array, first element should be maximum value, second minimum value, third second maximum value ,
fourth second minimum value, fifth third maximum and so on.
 */
public class _15 {
    public static void main(String[] args) {

        int vargu[] = {0, 1, 3, 4, 5, 6, 7, 8, 10};

        rearrangeMaxMin(vargu);
        for (int i : vargu) {
            System.out.print(i + " ");
        }
    }

    private static void rearrangeMaxMin(int[] vargu) {

        int[] temp = new int[vargu.length];

        int min = 0;
        int max = vargu.length - 1;
        boolean flag = true;

        for (int i = 0; i < vargu.length; i++) {

            if (flag) {
                temp[i] = vargu[max--];
            }
            else {
                temp[i] = vargu[min++];
            }

            flag = !flag;
        }

        for (int i = 0; i < temp.length; i++) {
            vargu[i] = temp[i];
        }

    }
}
