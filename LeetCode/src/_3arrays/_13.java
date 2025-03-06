package _3arrays;
/*
    13. Write a C++ program to separate even and odd numbers in an array of integers. Put all even numbers first,
    and then odd numbers.
 */
public class _13 {
    public static void main(String[] args) {

        int[] vargu = {0, 1, 3, 4, 5, 6, 7, 8, 10};

        int leftNum = 0;
        int rightNum = vargu.length - 1;

        while (leftNum < rightNum) {

            while (vargu[leftNum] % 2 == 0 && leftNum < rightNum) {
                leftNum++;
            }

            while (vargu[rightNum] % 2 == 1 && leftNum < rightNum) {
                rightNum--;
            }

            if (leftNum < rightNum) {
                //swap:
                int temp = vargu[leftNum];
                vargu[leftNum] = vargu[rightNum];
                vargu[rightNum] = temp;
                leftNum++;
                rightNum--;
            }
        }

        for (int i : vargu) {
            System.out.print(i + " ");
        }
    }

}
