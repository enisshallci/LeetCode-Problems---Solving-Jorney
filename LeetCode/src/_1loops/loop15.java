package _1loops;
import java.util.Scanner;
/*
15. Write a program in C++ to asked user to input positive integers to process count, maximum, minimum, and average or terminate the process with -1.
Your input is for termination. Here is the result below:
Number of positive integers is: 4
The maximum value is: 9
The minimum value is: 3
The average is 6.00
 */
public class loop15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a positive integers to calculate some processes or -1 to terminate:");
        int numri = input.nextInt();

        int count = 0, min = numri, max = numri, shuma = 0;
        double average;

        while(true) {

          if (numri == -1) {
              System.out.print("Please write an integer number: ");
              break;
          }

          count++;

          if (numri > max) {
              max = numri;
          }

          if (numri < min) {
              min = numri;
          }

          shuma += numri;

          System.out.println("Input a positive integers to calculate some processes or -1 to terminate:");
          numri = input.nextInt();
        }

        average = (double) shuma / count;
        System.out.println("The maximum value is " + max);
        System.out.println("The minimum value is " + min);
        System.out.println("The average value is " + average);

    }
}
