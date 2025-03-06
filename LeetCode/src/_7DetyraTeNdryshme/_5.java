package _7DetyraTeNdryshme;
import java.util.ArrayList;

/*
    Eshte dhene nje fjali qe ka fjale palindrome, gjej palindromet dhe renditi prej me te gjates tek me e shkurta.
 */
public class _5 {
    public static void main(String[] args) {

        String fjalia = "radar refer enis shallci nga skroma sos suaaus rotator";

        String[] fjalet = fjalia.trim().split(" ");

        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < fjalet.length; i++) {

            String palindrome = "";
            for (int j = fjalet[i].length() - 1; j >= 0; j--) {
                palindrome += fjalet[i].charAt(j);
            }

            if (fjalet[i].equals(palindrome)) {
                lista.add(fjalet[i]);
            }
        }

        //Sortimi, bubble sort:

        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - i - 1; j++) {
                if (lista.get(j).length() < lista.get(j + 1).length()) {            //prej me te gjates.
                    String temp = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j + 1, temp);
                }
            }
        }

        for (String s : lista) {
            System.out.print(s + " ");
        }
    }
}
