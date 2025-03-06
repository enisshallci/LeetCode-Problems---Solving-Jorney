package _1loops;
/*
2. Write a program in C++ to find the sum of first 10 natural numbers. Go to the editor
Sample Output:
Find the first 10 natural numbers:
---------------------------------------
The natural numbers are:
1 2 3 4 5 6 7 8 9 10
The sum of first 10 natural numbers: 55
 */
public class loop2 {
    public static void main(String[] args) {

        System.out.println("Find the first 10 natural numbers:");
        System.out.println("----------------------------------");
        System.out.println("The natural numbers are:");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            sum += i;
        }

        System.out.println("\nThe sum of first 10 natural numbers: " + sum);

    }
}
