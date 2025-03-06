package _2strings;
/*
35. Write a C++ program to reverse all words that have odd lengths in a string.
Test Data:
("Exercises Practice Solution" ) -> "sesicrexE Practice Solution"
("The quick brown fox jumps over the lazy dog") -> "ehT kciuq nworb xof spmuj over eht lazy dog."
 */
public class _35 {
    public static void main(String[] args) {

        String text = "The quick brown fox jumps";

        String[] vargu = text.split(" ");

        for (int i = 0; i < vargu.length; i++) {
            String elementi = "";
            if (vargu[i].length() % 2 != 0) {
                for (int j = vargu[i].length() - 1; j >= 0; j--) {
                    elementi += vargu[i].charAt(j);
                }
                vargu[i] = elementi;
            }
        }

        for (String s : vargu) {
            System.out.print(s + " ");
        }

    }
}
