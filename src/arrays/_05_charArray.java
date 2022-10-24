package arrays;

import java.util.Arrays;

public class _05_charArray {
    public static void main(String[] args) {

        System.out.println("\n-------TASK-1-------\n");
        char[] characters = {'#', '$', '5', 'A', 'b', 'H'};
        System.out.println(Arrays.toString(characters));

        System.out.println("\n-------TASK-2-------\n");
        System.out.println(characters.length);

        System.out.println("\n-------TASK-3-------\n");
        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }

        System.out.println("\n-------TASK-4-------\n");
        for (char character: characters){
            System.out.println(character);
        }

        System.out.println("\n-------TASK-5-------\n");

        for (int i = 0; i < characters.length; i++){
        if (Character.isLetter(characters[i])) System.out.println(characters[i]);
        }

        for (char character : characters) {
            if (Character.isLetter(character)) System.out.println(character);
        }

        System.out.println("\n-------TASK-6-------\n");
        int counter = 0;
        for (char character : characters) {
            if (Character.isUpperCase(character)) counter++;
        }
        System.out.println(counter);

        int counter02 = 0;
        for (int i = 0; i < characters.length; i++) {
            if(Character.isUpperCase(characters[i])) counter02++;
        }
        System.out.println(counter02);



    }
}
