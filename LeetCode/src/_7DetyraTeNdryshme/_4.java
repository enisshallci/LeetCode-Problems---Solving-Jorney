package _7DetyraTeNdryshme;
/*
    Gjeje elementin e vargut qe perseritet me se shpeshti dhe shfaqe sa here gjendet ai numer ne ate varg.
 */
public class _4 {
    public static void main(String[] args) {

        int[] vargu = {1, 2, 3, 2, 5, 6, 2, 8, 2, 9, 2};

        int max = 0;
        int elementi = 0;
        for (int i = 0; i < vargu.length; i++) {
            int count = 1;
            int c = vargu[i];
            for (int j = i + 1; j < vargu.length; j++) {
                if (c == vargu[j]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                elementi = vargu[i];
            }
        }

        System.out.println("Elementi qe perseritet me se shumti ne varg eshte " + elementi + " dhe ka " + max + " perseritje.");

    }
}
