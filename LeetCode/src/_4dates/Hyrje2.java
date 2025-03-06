package _4dates;
/*
    Shfaqe diten e javes, shfaqe muajin dhe vitin.
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hyrje2 {
    public static void main(String[] args) {

        Date currentDate = new Date();

        //Muajin
        SimpleDateFormat dayOfTheWeek = new SimpleDateFormat("EEEE");   //e hene, e marte, e merkure , gjith e perpara.
        System.out.println(dayOfTheWeek.format(currentDate));

        //Diten e javes:
        SimpleDateFormat monthOfYear = new SimpleDateFormat("MMMM");
        System.out.println(monthOfYear.format(currentDate));

        //Vitin
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        System.out.println(yearFormat.format(currentDate));

    }
}
