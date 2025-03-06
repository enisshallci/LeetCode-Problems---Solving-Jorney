package _7DetyraTeNdryshme;
/*
    Gjej shkronjen qe eshte perseritur me se shpeshti ne nje fjale ose fjali dhe te shfaqet cila shkronje eshte dhe sa here eshte
    perseritur.
 */
public class _3 {
    public static void main(String[] args) {

        String fjalia = "Enis shallci nga skroma";

        fjalia = fjalia.toLowerCase();  //Nese eshte case insensitive, pra E = e.
        int max = 0;
        char karakteriMax = ' ';
        for (int i = 0; i < fjalia.length(); i++) {
            int count = 0;
            char c = fjalia.charAt(i);
            if (c >= 97 && c <= 122) {
                for (int j = i; j < fjalia.length(); j++) {
                    if (c == fjalia.charAt(j)) {
                        count++;
                    }
                }
                if (count > max) {
                    max = count;
                    karakteriMax = c;
                }
            }
        }

        System.out.println("Shkronja me e perseritur eshte \"" + karakteriMax + "\" dhe eshte perseritur \"" + max + "\" here ne fjali.");

    }
}
