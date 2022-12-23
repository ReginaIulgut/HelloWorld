package homeworks;

import java.util.Arrays;

public class Homework12 {

    // TASK-1
    public static String noDigit(String str){
        return str.replaceAll("\\d+", "");
    }

    // TASK-2
    public static String noVowels(String str){
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    // TASK-3
    public static int sumOfDigits(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i)))
                sum += Character.getNumericValue(str.charAt(i));
        }
        return sum;
    }

    //  TASK-4
    public static boolean hasUpperCase(String str){
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i)))
                return true;
        }
        return false;
    }

    // TASK-5
    public static int middleInt(int a, int b, int c){
        if ((a < c && a > b) || (a > c && a < b)) return a;
        else if ((b < c && b > a) || (b > c && b < a)) return b;
        return c;
    }

    // TASK-6
    public static int[] no13(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 13)
                numbers[i] = 0;
        }
        return numbers;
    }

    // TASK-7
    public static int[] arrFactorial(int[] numbers){

        int factorial;
        for (int i = 0; i < numbers.length; i++) {
            factorial = 1;
            for (int j = 1; j <= numbers[i]; j++) {
                factorial *= j;
            }
            numbers[i] = factorial;
        }
        return numbers;
    }

    // TASK-8
    public static String[] categorizeCharacters(String str){

        String[] arrStr = {"","",""};
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') return arrStr;
            if(Character.isLetter(str.charAt(i))) arrStr[0] += str.charAt(i);
            else if(Character.isDigit(str.charAt(i))) arrStr[1] += str.charAt(i);
            else arrStr[2] += str.charAt(i);
        }
        return arrStr;
    }


    public static void main(String[] args) {

        System.out.println("\n-------TASK-1-------\n");
        System.out.println(noDigit("123Tech456Global789"));

        System.out.println("\n-------TASK-2-------\n");
        System.out.println(noVowels("TechGlobal123&"));

        System.out.println("\n-------TASK-3-------\n");
        System.out.println(sumOfDigits("Price is = $125.0"));

        System.out.println("\n-------TASK-4-------\n");
        System.out.println(hasUpperCase("JaVa"));

        System.out.println("\n-------TASK-5-------\n");
        System.out.println(middleInt(-1, 25, 10));

        System.out.println("\n-------TASK-6-------\n");
        int[] numbers = {13,3,12,13,113};
        System.out.println(Arrays.toString(no13(numbers)));

        System.out.println("\n-------TASK-7-------\n");
        int[] numbersForTask7 = {1,2,3,0};
        System.out.println(Arrays.toString(arrFactorial(numbersForTask7)));

        System.out.println("\n-------TASK-8-------\n");
        System.out.println(Arrays.toString(categorizeCharacters("12ab%3c#$")));
    }
}