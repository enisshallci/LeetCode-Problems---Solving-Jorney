package _1loops;
import java.util.Scanner;
/*
68. Write a program that will print the first N numbers for a specific base. Go to the editor
Sample Output:
Print the first N numbers for a specific base:
The number 11 in base 10 = 1*(10^1)+1*(10^0)=11
Similarly the number 11 in base 7 = 1*(7^1)+1*(7^0)=8
 */
public class loop68 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Print the number: ");
        int number = input.nextInt();
        System.out.print("Print the base: ");
        int base = input.nextInt();

        int count = -1;
        int reversedNumber = 0;
        for (int i = number; i != 0; i /= 10) {

            int mbetja = i % 10;
            reversedNumber = (reversedNumber * 10) + mbetja;
            count++;
        }

        int sum = 0;
        int termi;
        for (int i = reversedNumber; i != 0; i /= 10) {

            int mbetja = i % 10;
            int fuqia = 1;

            for (int f = count; f > 0; f--) {
                fuqia *= base;
            }

            termi = mbetja * (fuqia);
            sum += termi;
            System.out.print(mbetja + "*(" + base + "^" + count + ")" + (i <= 9 ? "=" : "+"));
            count--;
        }

        System.out.println(sum);
    }
}
