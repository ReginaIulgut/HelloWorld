package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework09 {
    public static void main(String[] args) {

        System.out.println("\n-------TASK-1-------\n");

        int[] numbers = {4, 0, -7, 0, 5, 10, 45, 45};

        ArrayList<Integer> numbs = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] == numbers[j])
                    numbs.add(numbers[j]);
            }
        }
        if (numbs.size() > 0) System.out.println(numbs.get(0));
        else System.out.println("There is no duplicates");

        System.out.println("\n-------TASK-2-------\n");

        String[] words = {"Z", "abc", "123", "#"};
        String firstDup = "";
        for (int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                if (words[i].equalsIgnoreCase(words[j])){
                    firstDup = words[j];
                    System.out.println(firstDup);
                    return;
                }
            }
        }
        if (firstDup.length() == 0) System.out.println("There is no duplicates");

        System.out.println("\n-------TASK-3-------\n");

        int[] numbers3 = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        ArrayList<Integer> numbs3 = new ArrayList<>();

        for (int i = 0; i < numbers3.length; i++){
            for (int j = i + 1; j < numbers3.length; j++){
                if (numbers3[i] == numbers3[j] && !numbs3.contains(numbers3[i])){
                    numbs3.add(numbers3[j]);
                }

            }
        }
        if (numbs3.isEmpty()) System.out.println("There is no duplicates");
        else for (Integer n : numbs3) System.out.println(n);

        System.out.println("\n-------TASK-4-------\n");

        String[] words4 = {"A", "foo", "12", "Foo", "bar", "a", "a", "java"};
        ArrayList<String> task4 = new ArrayList<>();

        for (int i = 0; i < words4.length; i++){
            for(int j = i + 1; j < words4.length; j++){
                if (words4[i].equalsIgnoreCase(words4[j]) && !task4.contains(words4[i])){
                    task4.add(words4[j]);
                }
            }
        }
        if (task4.isEmpty()) System.out.println("There is no duplicates");
        else for (String s : task4) {
            System.out.println(s);
        }

        System.out.println("\n-------TASK-5-------\n");

        String[] words5 = {"abc", "foo", "bar"};
        for (int i = words5.length - 1; i >= 0; i--){
            System.out.println(words5[i]);
        }

        System.out.println("\n-------TASK-6-------\n");

        String str = "Java is fun";
        ArrayList<String> words6 = new ArrayList<>(Arrays.asList(str.split(" ")));

        for (String s : words6) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.print(sb + " ");
        }

        }
}
