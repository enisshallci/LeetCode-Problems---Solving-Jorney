package _4dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hyrje1 {
    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println(currentDate);

        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println(timeFormat.format(currentDate));

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");       //  month/day/year
        System.out.println(dateFormat.format(currentDate));

        SimpleDateFormat dayOfTheWearkFormat = new SimpleDateFormat("EEEE");
        System.out.println(dayOfTheWearkFormat.format(new Date()));

        SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
        System.out.println(clockFormat.format(currentDate));
    }
}
