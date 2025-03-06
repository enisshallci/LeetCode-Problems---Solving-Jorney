package _1loops;
/*
51. Write a program in C++ to display the pattern using digits with right justified and the highest columns appears in first row. Go to the editor
Sample Output:
 Input number of rows: 5
12345
 1234
  123
   12
    1
 */
public class loop51 {
    public static void main(String[] args) {

        int number = 5;

        for (int i = number; i >= 1; i--) {

            for (int h = 1; h <= number - i; h++) {
                System.out.print(" ");
            }


            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();


        }

    }
}
