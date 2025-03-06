package _1loops;
/*
4. Write a program in C++ to find the perfect numbers between 1 and 500. Go to the editor
The perfect numbers between 1 to 500 are:
6
28
496
 */
public class loop4 {
    public static void main(String[] args) {

        System.out.println("The perfect numbers between 1 to 500 are: ");
        for (int i = 1; i <= 500; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {

                if (i % j == 0) {
                    sum += j;
                }
            }

            if (sum == i) {
                System.out.println(i);
            }
        }


    }
}
