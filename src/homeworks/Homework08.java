package homeworks;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Homework08 {
    public static void main(String[] args) {

        System.out.println("\n-------TEST TASK-1-------\n");
        String str = "hello";
        System.out.println(countConsonants(str));

        System.out.println("\n-------TEST TASK-2-------\n");
        String str2 = "Java  is   fun  ";

        System.out.println("\n-------TEST TASK-3-------\n");
        String str3 = "Java  is   fun  ";
        System.out.println(removeExtraSpaces(str3));

        System.out.println("\n-------TEST TASK-5-------\n");
        String str5 = "10/02/1991";
        System.out.println(isDateFormatValid(str5));

        System.out.println("\n-------TEST TASK-6-------\n");
        String str6 = "abc@gmail.com";
        System.out.println(isEmailFormatValid(str6));



    }

    public static int countConsonants(String str){
        return str.replaceAll("[aeiouAEIOU]", "").length();
    }

    /*
    public static String[] wordArray (String word){
        String[] wordArray = word.split(" ");
        Arrays.stream(wordArray).filter(x -> x.equals(" "));
    }

     */

    public static String removeExtraSpaces(String str){
        return str.replaceAll("\\s+", " ");
    }

    public static boolean isDateFormatValid(String dateOfBirth){
        return dateOfBirth.matches("[\\d]{2}/[\\d]{2}/[\\d]{4}");
    }

    public static boolean isEmailFormatValid (String emailAddress){
        return Pattern.matches("[\\S][a-zA-Z]{2,}@[a-zA-Z]{2,}.[a-zA-Z]{2,}", emailAddress);
    }
}
