package _4dates;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Hyrje4 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.of(2023, 1, 1, 12, 0,0);
        LocalDateTime localDateTime1 = LocalDateTime.of(2025, 1, 1, 12, 0, 0);

        long totalHours = ChronoUnit.HOURS.between(localDateTime, localDateTime1);

        System.out.println("Hours: " + totalHours);
        System.out.println("Days: " + ((double) totalHours / 24));

    }
}
