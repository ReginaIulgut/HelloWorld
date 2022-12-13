package exception_handling.custom_exception;

import utilities.ScannerHelper;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestPermission {
    public static void main(String[] args) {
        int age = ScannerHelper.getAnAge();

        try {
            if (Permission.isAgeValid(age)) System.out.println("You can get DL");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("You're only " + age + ".");
        }


        try {
            System.out.println(Permission.getCheckInHours(ScannerHelper.getANumber()));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            Date date = new Date();
            SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
            System.out.println(dayFormat.format(date));
        }
    }
}
