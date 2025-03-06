package _4dates;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
2. Write a C++ program to get the day of the week from a given date. Return the day as a string.
The format of the day is MM/DD/YYYY.
Date: 02/05/1980 Day of the week: Tuesday
Date: 01/24/1990 Day of the week: Wednesday
Date: 01/05/2019 Day of the week: Saturday
Date: 11/17/2022 Day of the week: Thursday
 */
public class _2 {
    public static void main(String[] args) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("'Date:' dd/MM/yyyy 'Day of the week' EEEE");
        System.out.println(dateFormat.format(new Date()));

    }
}
