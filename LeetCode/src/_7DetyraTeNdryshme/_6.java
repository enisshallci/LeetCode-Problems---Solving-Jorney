package _7DetyraTeNdryshme;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
    Gjej diferencen ndermjet dy datave, diference te jete ne vit, muaj, dite , ore , minute, sekonda.
 */
public class _6 {
    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2021, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 05, 12);

        long years = ChronoUnit.YEARS.between(startDate, endDate);
        long months = ChronoUnit.MONTHS.between(startDate, endDate);
        long days = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);

    }
}
