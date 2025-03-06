package _7DetyraTeNdryshme;

import java.util.ArrayList;

public class _8 {
    public static void main(String[] args) {

        int[] vargu = {1, -1, 2, 1, -2, -4, 2};

        ArrayList<ArrayList> lista = new ArrayList<>();

        for (int i = 0; i < vargu.length; i++) {

            for (int j = 0; j < vargu.length; j++) {
                if (j == i) {
                    continue;
                }
                for (int z = 0; z < vargu.length; z++) {
                    if (z == i || z == j) {
                        continue;
                    }
                    if (vargu[i] + vargu[j] + vargu[z] == 0) {
                        ArrayList<Integer> miniLista = new ArrayList<>();
                        miniLista.add(vargu[i]);
                        miniLista.add(vargu[j]);
                        miniLista.add(vargu[z]);
                        lista.add(miniLista);
                    }
                }
            }
        }

        System.out.println(lista);

    }
}
