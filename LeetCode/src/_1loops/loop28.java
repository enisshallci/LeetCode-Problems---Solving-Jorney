package _1loops;
/*
28. Write a program in C++ to find the number and sum of all integer between 100 and 200 which are divisible by 9. Go to the editor
Sample Output:
Numbers between 100 and 200, divisible by 9:
108 117 126 135 144 153 162 171 180 189 198
The sum : 1683
 */
public class loop28 {
    public static void main(String[] args) {


        divisibleBy9();
    }

    private static void divisibleBy9() {

        System.out.println("Numbers between 100 and 200, divisible by 9:");
        int sum = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nThe sum: " + sum);
    }
}
