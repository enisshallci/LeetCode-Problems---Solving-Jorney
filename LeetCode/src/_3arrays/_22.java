package _3arrays;
/*
    22. Write a C++ program to find the missing element from two given arrays of integers except one element.
 */
public class _22 {
    public static void main(String[] args) {
/*
    XOR i ka vetite:
    1) Komutative
        a ^ b = b ^ a
    2) Asociative:
        a ^ (b ^ c) = (a ^ b) ^ c
 */
        int array1[] = {3, 5, 7, 9};
        int array2[] = {3, 7, 1, 5, 9};

        int result = 0;
        for (int i = 0; i < array1.length; i++) {
            result = result ^ array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            result = result ^ array2[i];
        }

        System.out.println(result);

    }
}
