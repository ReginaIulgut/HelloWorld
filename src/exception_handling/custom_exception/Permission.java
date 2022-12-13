package exception_handling.custom_exception;

public class Permission {

    public static boolean isAgeValid (int age){

        if(age > 16) return true;
        throw new IllegalStateException("Age of " + age + " is restricted!!!");
    }

    public static String getCheckInHours (int day) {

        if( day == 2 || day == 3 || day == 4 || day == 5 || day == 6)
            return "Check in hours are from 10 AM to 4 PM";
        else if (day == 1 || day == 7) return "Check in hours are from 10AM to 3PM";
        throw new IllegalStateException ("The input does not represent any day!");
    }

}
