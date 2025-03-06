package _3arrays;
/*
     Write a C++ program to find and print all common elements in three sorted arrays of integers.
 */
public class _25 {
    public static void main(String[] args) {

        int array1[] = {1, 5, 7, 8, 9, 11};
        int array2[] = {6, 8, 10, 11, 12, 16};
        int array3[] = {1, 3, 5, 6, 8, 10, 11, 17};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    for (int z = 0; z < array3.length; z++) {
                        if (array1[i] == array3[z]) {
                            System.out.println(array1[i]);
                            break;
                        }
                    }
                    break;
                }
            }
        }

    }
}
