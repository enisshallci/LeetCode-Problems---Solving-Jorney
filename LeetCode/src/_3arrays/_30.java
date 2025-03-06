package _3arrays;
/*
    30. Write a C++ program to find the third largest string in a given array of strings.
 */
public class _30 {
    public static void main(String[] args) {

        String[] vargu1 = { "abcdefgh", "abcdefgh", "abcdefg", "abcdefg", "abcdef", "abcde", "abcd" };

        System.out.println(check(vargu1));
    }

    private static String check(String[] vargu) {

        String s1, s2, s3;
        s1 = s2 = s3 = "";

        for (int i = 0; i < vargu.length; i++) {

            if (vargu[i].length() > s1.length()) {
                s3 = s2;
                s2 = s1;
                s1 = vargu[i];
            }

            else if (vargu[i].length() > s2.length() && !vargu[i].equals(s1)) {
                s3 = s2;
                s2 = vargu[i];
            }

            else if (vargu[i].length() > s3.length() && !vargu[i].equals(s2) && !vargu[i].equals(s1)) {
                s3 = vargu[i];
            }
        }

        /*
            Kur s3 eshte e ndryshme prej s2 i bjen qe edhe eshte e ndryshme prej s1, sepse s2 eshte ndryshe me s1.
         */

        return s3;
    }
}
