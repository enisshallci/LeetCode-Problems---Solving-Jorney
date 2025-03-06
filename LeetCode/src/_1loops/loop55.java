package _1loops;
/*
55. Write a program in C++ to display such a pattern for n number of rows using number. Each row will contain odd numbers of number. The first and last number of each row will be 1 and middle column will be the row number. n numbers of columns will appear in 1st row. Go to the editor
Sample Output:
Input number of rows: 7

1234567654321
 12345654321
  123454321
   1234321
    12321
     121
      1
 */
public class loop55 {
    public static void main(String[] args) {

        int number = 7;

        for (int i = number ; i >= 1; i--) {

            for (int h = 1; h <= number - i; h++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int z = i - 1; z >= 1; z--) {
                System.out.print(z);
            }

            System.out.println();
        }


    }
}
