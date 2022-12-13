package date_time;

import utilities.ScannerHelper;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class CalculateAge {
    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat currentYear = new SimpleDateFormat("yyyy");

        int age = ScannerHelper.getAnAge();

        // System.out.println(Integer.parseInt(currentYear.format(date)) - age);

        System.out.println(LocalDate.now().getYear() - age);


    }
}
