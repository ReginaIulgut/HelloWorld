package arrays;

import java.util.Arrays;

public class Exercise01_countChar {
    public static void main(String[] args) {
        /*
        how many 'a' letters you have in the String
        EXPECTED: 2
         */
        String word = "Java";

        /*
        int counter = 0;
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == 'a') counter++;
        }
        System.out.println(counter);
         */

        char[] wordArray = word.toCharArray();
        System.out.println(Arrays.toString(wordArray));

        int counter = 0;
        for(char element : wordArray){
            if(element == 'a') counter++;
        }
        System.out.println(counter);

    }
}
