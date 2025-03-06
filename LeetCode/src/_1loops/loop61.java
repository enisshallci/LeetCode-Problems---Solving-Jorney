package _1loops;
import java.util.Scanner;
/*
61. Write a program in C++ to print all ASCII character with their values. Go to the editor
Sample Output:
Input the starting value for ASCII characters: 65
Input the ending value for ASCII characters: 75
The ASCII characters:
65 --> A
66 --> B
67 --> C
68 --> D
69 --> E
70 --> F
71 --> G
72 --> H
73 --> I
74 --> J
75 --> K
 */
public class loop61 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the starting value for ASCII characters: ");
        int start = input.nextInt();
        System.out.print("Input the ending value for ASCII characters: ");
        int end = input.nextInt();

        printAscii(start, end);
    }

    private static void printAscii(int start, int end) {

        System.out.println("The ASCII characters: ");
        for (int i = start; i <= end; i++) {

            System.out.println(i + " --> " + (char) i);
        }
    }
}
