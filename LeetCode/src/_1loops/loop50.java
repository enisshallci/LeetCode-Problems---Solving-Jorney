package _1loops;
/*
50. Write a program in C++ to print a pattern like highest numbers of columns appear in first row. Go to the editor
Sample Output:
 Input the number of rows: 5
12345
2345
345
45
5
 */
public class loop50 {
    public static void main(String[] args) {

        int number = 5;

        for (int i = 1; i <= number; i++) {

            for (int j = i; j <= number; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

    }
}
