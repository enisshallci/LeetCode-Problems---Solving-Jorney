package _1loops;
/*
52. Write a program in C++ to display the pattern using digits with left justified and the highest columns appears in first row in descending order. Go to the editor
Sample Output:
 Input number of rows: 5
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
 */
public class loop52 {
    public static void main(String[] args) {

        int number = 5;

        for (int i = number; i >= 1; i--) {

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }
}
