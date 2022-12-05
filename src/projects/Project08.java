package projects;

import java.util.Arrays;

public class Project08 {
    public static void main(String[] args) {

        System.out.println("\n-------TASK-1-------\n");
        int[] numbers = {10, -5, 20, 50, 100};
        System.out.println(findClosestDistance(numbers));

        System.out.println("\n-------TASK-2-------\n");
        int[] numbers2 = {5, 3, -1, 3, 5, 7, -1};
        System.out.println(findSingleNumber(numbers2));

        System.out.println("\n-------TASK-3-------\n");
        System.out.println(findFirstUniqueCharacter("abab"));

        System.out.println("\n-------TASK-4-------\n");
        int[] numbers4 = {5,6,7,1,2,3};
        System.out.println(findMissingNumber(numbers4));

    }


    public static int findClosestDistance(int[] numbers) {
        int closestDistance = Integer.MAX_VALUE;
        if (numbers.length <= 1)
            return closestDistance = -1;
        else
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (Math.abs(numbers[i] - numbers[j]) < closestDistance)
                        closestDistance = Math.abs(numbers[i] - numbers[j]);
                }

            }
        return closestDistance;

    }

    public static int findSingleNumber(int[] numbers) {
        int singleValue = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] != numbers[j])
                    singleValue = numbers[i];
            }
        }
        return singleValue;
    }

        public static char findFirstUniqueCharacter(String str){
        char result = ' ';
        for (int i = 0; i < str.length(); i++) {
            char tempUnique = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (tempUnique != str.charAt(j))
                    result = tempUnique;
                break;
            }
        }
        return result;
    }

/*
        Another way to find first unique character

        public static char findFirstUniqueCharacter(String str) {
        char singleChar = ' ';
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)))
                singleChar = str.charAt(i);
            break;
                }
        return singleChar;
    }
 */
    public static int  findMissingNumber (int[] numbers){
        Arrays.sort(numbers);
        int missingNumber = 0;
        for(int i = 0; i < numbers.length - 1; i++){
            if (Math.abs(numbers[i] - numbers[i+1]) != 1)
                missingNumber = numbers[i] + 1;
        }
        return missingNumber;
    }
}
