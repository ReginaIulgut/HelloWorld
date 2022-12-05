package homeworks;

import java.util.Arrays;

public class Homework11 {
    public static void main(String[] args) {
        System.out.println("\n-------TASK-1-------\n");
        System.out.println(noSpace("  J  av  a  "));

        System.out.println("\n-------TASK-2-------\n");
        System.out.println(replaceFirstLast("e"));

        System.out.println("\n-------TASK-3-------\n");
        System.out.println(hasVowel("ABC"));

        System.out.println("\n-------TASK-4-------\n");
        checkAge(1890);

        System.out.println("\n-------TASK-5-------\n");
        System.out.println(averageOfEdges(-3, 15, -3));

        System.out.println("\n-------TASK-6-------\n");
        String[] arr = {"appium", "123", "ABC", "java"};
        System.out.println(Arrays.toString(noA(arr)));

        System.out.println("\n-------TASK-7-------\n");
        int[] numbers7 = {3,4,5,6,7,8};
        System.out.println(Arrays.toString(no3or5(numbers7)));

        System.out.println("\n-------TASK-8-------\n");
        int[] numbers8 = {41, 53, 19, 47, 67};
        System.out.println(countPrimes(numbers8));


    }

    public static String noSpace(String str){
        return str.replaceAll("\\s+", "").trim();
    }

    public static String replaceFirstLast(String str){
        str = str.trim();
        if (str.length() < 2) return "";
        else
            return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }

    public static boolean hasVowel(String str){
        return str.toLowerCase().contains("a") || str.toLowerCase().contains("e") ||
                str.toLowerCase().contains("i") || str.toLowerCase().contains("o") || str.toLowerCase().contains("u");
    }

    public static void checkAge(int yearOfBirth){
        int currentYear = 2022;
        int age = currentYear - yearOfBirth;

        if(age > 100 || currentYear < yearOfBirth) System.out.println("AGE IS NOT VALID");
        else if (age < 16) System.out.println("AGE IS NOT ALLOWED");
        else System.out.println("AGE IS ALLOWED");
    }

    public static int averageOfEdges(int a, int b, int c){

        int max = Math.max(Math.max(a,b),c);
        int min = Math.min(Math.min(a,b),c);

        return (min+max)/2;
    }

    public static String[] noA(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].toLowerCase().startsWith("a"))
                arr[i] = "###";
        }
        return arr;
    }

    public static int[] no3or5(int[] numbers) {

        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i] % 15 == 0)
                numbers[i] = 101;
            else if(numbers[i] % 5 == 0)
                numbers[i] = 99;
            else if(numbers[i] % 3 == 0 )
                numbers[i] = 100;
        }
        return numbers;
    }

    public static int countPrimes(int[] arr){
        int primes = 0;
        for (int num : arr) {
            if (num < 2) continue;
            boolean isPrime = true;
            for (int i = 2; i <= num /2; i++) {
                if (num % i == 0) isPrime = false;
            }
            if (isPrime) primes++;
        }
        return primes;
    }
}
