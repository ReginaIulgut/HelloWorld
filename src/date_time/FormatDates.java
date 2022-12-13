package date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDates {
    public static void main(String[] args) {
        System.out.println("\n---Formatting date---\n");
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        System.out.println(formatter.format(date));
    }
}
