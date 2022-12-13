package date_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class CurrentDate {
    public static void main(String[] args) {

        System.out.println("\n-----Date class-----\n");
        Date date = new Date();
        System.out.println(date);

        System.out.println("\n-----LocalDate class-----\n");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println(localDate.plusDays(5));

        System.out.println("\n-----LocalTime class-----\n");
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }
}
