package _3arrays;
/*
    24. Write a C++ program to find the first repeating element in an array of integers.
 */
public class _24 {
    public static void main(String[] args) {

        int vargu[] = {3, 1, 5, 1, 5, 7, 9, 7, 9};

        boolean flag = false;
        for (int i = 0; i < vargu.length; i++) {
            for (int j = i + 1; j < vargu.length; j++) {
                if (vargu[i] == vargu[j]) {
                    System.out.println(vargu[i]);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;      //pasi po pyet per first repeating:
            }
        }
    }
}
