package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework13 {

    // TASK-1
    public static boolean hasLowerCase(String str){
        for (int i = 0; i < str.length(); i++){
            if(Character.isLowerCase(str.charAt(i))) return true;
        }
        return false;
    }

    // TASK-2
    public static ArrayList<Integer> noZero(ArrayList<Integer> numbers){
        ArrayList<Integer> noZero = new ArrayList<>();
        for (int number : numbers){
            if(number != 0) noZero.add(number);
        }
        return noZero;
    }

    // TASK-3

    // TASK-4
    public static boolean containsValue (String[] strings, String str){
        for (String string : strings) {
            if(string.equals(str)) return true;
        }
        return false;
    }

    // TASK-5
    public static String reverseSentence (String str){
        String[] words = str.trim().replaceAll("\\s+", " ").split(" ");
        String reverseSentence = "";
        if (words.length == 0 || words.length == 1) {
            return "There is not enough words!";
        }
        for(int i = words.length - 1; i >= 0; i--){
            reverseSentence += words[i] + " ";
        }
        return reverseSentence;
    }

    // TASK-6
    public static String removeStringSpecialDigits(String str){
        String removeStr = "";
        for(int i = 0; i < str.length(); i++){
            if(Character.isLetter(str.charAt(i)) || str.charAt(i) == ' ') removeStr += str.charAt(i);
        }
        return removeStr;
    }

    // TASK-7
    public static String[] removeArraySpecialDigits(String[] arr){
        String[] newArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; i < arr[i].length(); i++){
                if (Character.isLetter(arr[i].charAt(j)) || arr[i].charAt(j) == ' ')
                    newArr[i] += arr[i].charAt(j);
            }
        }
        return newArr;
    }

    // TASK-8
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> str1, ArrayList<String> str2){
        ArrayList<String> newStringArrayList = new ArrayList<>();
        for(int i = 0; i < str1.size(); i++){
            for (int j = 1; j < str2.size(); j++) {
                if (str1.get(i).equals(str2.get(j)) && !newStringArrayList.contains(str2.get(j)))
                    newStringArrayList.add(str2.get(j));
            }
        }
        return newStringArrayList;
    }

    // TASK-9


    public static void main(String[] args){

        System.out.println("\n-------TASK-1-------");
        System.out.println(hasLowerCase("Java"));

        System.out.println("\n-------TASK-2-------");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 0, 10));
        System.out.println(noZero(numbers));

        System.out.println("\n-------TASK-3-------");

        System.out.println("\n-------TASK-4-------");
        String[] arrForTask4 = {"abc", "def", "123"};
        System.out.println(containsValue(arrForTask4, "123"));

        System.out.println("\n-------TASK-5-------");
        System.out.println(reverseSentence("This"));

        System.out.println("\n-------TASK-6-------");
        System.out.println(removeStringSpecialDigits("123Java *&^%is fun"));

        System.out.println("\n-------TASK-7-------");
        String[] arrForTask7 = {"123Java", "Selenium", "^&%$#"};
        // System.out.println(Arrays.toString(removeArraySpecialDigits(arrForTask7)));

        System.out.println("\n-------TASK-8-------");
        ArrayList<String> listTask8 = new ArrayList<>(Arrays.asList("Java", "is", "fun", "a lot"));
        ArrayList<String> listTask08 = new ArrayList<>(Arrays.asList("abc", "xyz", "123", "Java"));
        // System.out.println(removeAndReturnCommons(listTask08, listTask8));

        System.out.println("\n-------TASK-9-------");

    }
}
