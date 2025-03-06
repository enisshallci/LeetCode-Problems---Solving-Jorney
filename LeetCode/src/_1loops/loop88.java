package _1loops;
/*
#
# # #
# # # # #
# # # # # # #
# # # # # # # # #
# # # # # # # # # # #
 */
public class loop88 {
    public static void main(String[] args) {
       // prej 1 deri 11 krejt numrat tek.

        for (int i = 1; i <= 11; i += 2) {
            for (int j = 1; j <= i; j++) {
                    System.out.print("# ");
            }
            System.out.println();
        }

        //Metoda tjeter:
//        int count = 1;
//        for (int i = 1; i <= 6; i++) {
//            for (int j = 1; j <= count; j++) {
//                System.out.print("# ");
//            }
//            count += 2;
//            System.out.println();
//        }


    }
}
