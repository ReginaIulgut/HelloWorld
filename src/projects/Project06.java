package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Project06 {
    public static void main(String[] args) {

        System.out.println("\n-------TEST TASK-1-------\n");
        String[] words = {"foo", "", " ", "foo bar", "java is fun", " ruby "};
        System.out.println(countMultipleWords(words));

        System.out.println("\n-------TEST TASK-2-------\n");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));
        System.out.println(removeNegatives(numbers));

        System.out.println("\n-------TEST TASK-3-------\n");
        String password = "Abcd123!";
        System.out.println(validatePassword(password));

        System.out.println("\n-------TEST TASK-4-------\n");
        String email = "abc@gmail.com";
        System.out.println(validateEmailAddress(email));

    }

    public static int countMultipleWords(String[] words){
        int counter = 0;
        for (String word : words) {
            word = word.trim();
            if (Pattern.matches("([\\w] [\\w])+", word)) counter++;
        }
        return counter;

    }

    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers){
        numbers.removeIf(number -> number < 0);
        return numbers;
        /*
        Iterator solution
        Iterator<Integer> numbersIterator = numbers.iterator();
        while (numbersIterator.hasNext()) {
            Integer number = numbersIterator.next();
            if (number < 0) numbersIterator.remove();
        }
        return numbers;
         */
    }
    public static boolean validatePassword(String password) {

        return (Pattern.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[\\d])(?=.*[@#%&*!+_])[\\S]{8,16}", password));
    }

    public static boolean validateEmailAddress (String emailAddress){
       return Pattern.matches("[\\S][a-zA-Z]{2,}@[a-zA-Z]{2,}.[a-zA-Z]{2,}", emailAddress);
    }
}
