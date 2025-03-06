package _1loops;
/*
53. Write a program in C++ to display the pattern like right angle triangle with right justified using digits. Go to the editor
Sample Output:
 Input number of rows: 5
    1
   21
  321
 4321
54321
 */
public class loop53 {
    public static void main(String[] args) {

        int number = 5;

        for (int i = 1; i <= number; i++) {

            for (int h = 1; h <= number - i; h++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
