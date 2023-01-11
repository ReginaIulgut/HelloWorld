package homeworks;

import java.util.HashMap;

public class Homework14 {
    // TASK-1
    public static void fizzBuzz1(int number){
        for (int i = 1; i <= number ; i++) {
            if(i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    // TASK-2
    public static String fizzBuzz2(int number){
        String fizzBuzz = "";
        if (number % 15 == 0) fizzBuzz = "FizzBuzz";
        else if (number % 3 == 0) fizzBuzz = "Fizz";
        else if (number % 5 == 0) fizzBuzz = "Buzz";
        else fizzBuzz = "" + number;
        return fizzBuzz;
    }

    // TASK-3
    public static int findSumNumbers(String str){
        String temp = "0";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch))
                temp += ch;
            else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        return sum + Integer.parseInt(temp);
    }

    // TASK-4
    public static int findBiggestNumber(String str){
        int num = 0, temp = 0;
        for (int i = 0; i<str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                num = num * 10 + (str.charAt(i)-'0');
            else {
                temp = Math.max(temp, num);
                num = 0;
            }
        }
        return Math.max(temp, num);
    }

    // TASK-5
    public static String countSequenceOfCharacters(String str){
        String countSeq = "";
        char[] charArray = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character ch : charArray){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) +1);
            }else{
                map.put(ch, 1);
            }
        }
        for (Character character : map.keySet()) {
            String key = character.toString();
            String value = map.get(character).toString();
            countSeq = value + key;
        }
        return countSeq;
    }

    public static void main(String[] args) {

        System.out.println("\n-------TASK-1-------\n");
        fizzBuzz1(18);

        System.out.println("\n-------TASK-2-------\n");
        System.out.println(fizzBuzz2(7));

        System.out.println("\n-------TASK-3-------\n");
        System.out.println(findSumNumbers("ab82  kj08"));

        System.out.println("\n-------TASK-4-------\n");
        System.out.println(findBiggestNumber("acv56mk90"));

        System.out.println("\n-------TASK-5-------\n");
        System.out.println(countSequenceOfCharacters("abbagh"));

    }
}
