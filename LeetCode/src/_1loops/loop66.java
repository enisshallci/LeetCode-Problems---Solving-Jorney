package _1loops;
import java.util.Scanner;
/*
66. Write code to create a checkerboard pattern with the words "black" and "white". Go to the editor
Sample Output:
Input number of rows: 5
black-white-black-white-black
white-black-white-black-white
black-white-black-white-black
white-black-white-black-white
black-white-black-white-black
 */
public class loop66 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int number = input.nextInt();


        String p = "black";
        String q = "white";

        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= number; j++) {

                if (j % 2 != 0) {
                    System.out.print(p);
                } else {
                    System.out.print(q);
                }

                if (j < number) {
                    System.out.print("-");
                }
            }

            System.out.println();
            //swap elements:
            String temp = p;
            p = q;
            q = temp;
        }


    }
}
