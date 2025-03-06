package _1loops;

public class loop91Interesant {
    public static void main(String[] args) {

        for (int n = 1; n <= 10; n++) {
            System.out.printf("\t\t%d", n);
        }
        System.out.println("\n\t\t___________________________________________________________________________");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d\t\t", i);
            System.out.print("|");
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d\t\t", i * j);
            }
            System.out.println();
        }
    }
}
