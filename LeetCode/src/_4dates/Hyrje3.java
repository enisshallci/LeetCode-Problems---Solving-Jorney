package _4dates;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Hyrje3 {
    public static void main(String[] args) {

        //Diferenca ndermjet dy datave:

        LocalDate localDate = LocalDate.of(1973, 01, 12);
        LocalDate curentDate = LocalDate.now();

        long days = ChronoUnit.DAYS.between(localDate, curentDate);
        System.out.println(days);
    }
}
