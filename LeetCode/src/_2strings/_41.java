package _2strings;

import java.util.Scanner;

/*
41. Write a C++ program that finds the position of the second occurrence of a string in another string.
 If the substring does not appear at least twice return -1.
Test Data:
("the qu qu", "qu") -> 7
("theququ", "qu") -> 5
("thequ", "qu") -> -1
 */
public class _41 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: " );
        String text1 = input.nextLine();
        System.out.print("Input a string: " );
        String text2 = input.nextLine();

        System.out.println(uniqueCharacters(text1, text2));
    }

    private static int uniqueCharacters(String fjalia, String fjala) {

        int count = 0;
        for (int i = 0; i < fjalia.length(); i++) {

            int temp = 0;
            char c = fjalia.charAt(i);
            if (c == fjala.charAt(temp++)) {
                //check per shkronjat e tjera:
                for (int j = i + 1; ;j++) {
                    if (fjalia.charAt(j) == fjala.charAt(temp++)) {
                        if (temp == fjala.length()) {
                            count++;
                            break;
                        }
                    } else {
                        break;  // dil nga kjo loop
                    }
                }
                if (count == 2) {
                    return i;
                }
            }
        }

        return -1;
    }
}
