package _7DetyraTeNdryshme;
/*
    Jane dhene dy numra A dhe B si minimumi dhe maksimumi i rangut (p.sh. 1 dhe 200). Kerkesa e detyres ka qene qe me i gjete
    dhe printu numrat dhe fuqine e trete te tyre (ne kub), qe kur ngriten ne fuqi jane brenda rangut A-B.
 */
public class _1 {
    public static void main(String[] args) {

        int B = 200;
        int A = 1;

        for (int i = 1; ; i++) {

            int fuqia = 1;
            for (int f = 1; f <= 3; f++) {          //Nashta ma mire veq me bo: i * i * i; Konsultim me chat gpt.
                fuqia *= i;
            }

            if (fuqia >= A && fuqia <= B) {
                System.out.println(i + " ^ 3 = " + fuqia);
            }
            else {
                break;
            }
        }

    }

}
