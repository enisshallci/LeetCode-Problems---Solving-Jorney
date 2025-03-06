package _3arrays;
/*
    8. Write a C++ program to find the next more powerful element of every element of a given array of integers.
     Ignore those elements that have no greater element.
 */
public class _8 {
    public static void main(String[] args) {

        int[] vargu = {4, 1, 5, 9, 12, 9, 22, 45, 7};

        for (int i = 0; i < vargu.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < vargu.length; j++) {
                if (vargu[j] > vargu[i]) {
                    temp = vargu[j];
                    break;
                }
            }
            if (temp != 0) {
                System.out.println(vargu[i] + " -> " + temp);
            }
        }

    }
}




