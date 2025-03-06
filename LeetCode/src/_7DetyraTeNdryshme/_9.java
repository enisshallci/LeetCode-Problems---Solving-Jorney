package _7DetyraTeNdryshme;

public class _9 {
    // CKA e ka caktu Allahu do te ndodhe, mos u lodhë

    public static void main(String[] args) {

        double i = 100;
        long factor = Math.round(i / 3);
        long z = 1;
        while (factor > 1) {

            if ((i + 4) % factor == 0) {
                z = z * factor;
            }
            factor = factor / 2;
        }

        System.out.println(z);

    }
}
