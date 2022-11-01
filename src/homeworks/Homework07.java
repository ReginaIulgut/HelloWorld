package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework07 {
    public static void main(String[] args) {
        System.out.println("--------TASK-1--------");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);
        System.out.println(numbers.get(3) + "\n" + numbers.get(0) +
                "\n" + numbers.get(2) + "\n" + numbers);

        System.out.println("\n--------TASK-2--------");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");
        System.out.println(colors.get(1) + "\n" + colors.get(3) +
                "\n" + colors.get(5) + "\n" + colors);

        System.out.println("\n--------TASK-3--------");
        ArrayList<Integer> numbersForTask3 = new ArrayList<>(Arrays.asList(23, -34, -56, 0, 89, 100));
        System.out.println(numbersForTask3);
        Collections.sort(numbersForTask3);
        System.out.println(numbersForTask3);

        System.out.println("\n--------TASK-4--------");
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Istanbul", "Berlin", "Madrid", "Paris"));
        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("\n--------TASK-5--------");
        ArrayList<String> marvelCharacters =
                new ArrayList<>(Arrays.asList("Spider Man", "Iron Man", "Black Panther", "Deadpool", "Captain America"));
        System.out.println(marvelCharacters);
        System.out.println(marvelCharacters.contains("Wolverine"));

        System.out.println("\n--------TASK-6--------");
        ArrayList<String> avengerCharacters =
                new ArrayList<>(Arrays.asList("Hulk", "Black Widow", "Captain America", "Iron Man"));
        System.out.println(avengerCharacters);
        System.out.println(avengerCharacters.contains("Hulk") && avengerCharacters.contains("Iron Man"));

        System.out.println("\n--------TASK-7--------");
        ArrayList<Character> cForTask7 = new ArrayList<>(Arrays.asList('A', 'x', '$', '%', '9', '*', '+', 'F', 'G'));
        System.out.println(cForTask7);
        for (char c: cForTask7){
            System.out.println(c);
        }

        System.out.println("\n--------TASK-8--------");
        ArrayList<String> objects =
                new ArrayList<>(Arrays.asList("Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"));
        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);
        int countM = 0;
        int countAOrE = 0;
        for (String object: objects){
            if (object.startsWith("M") || object.startsWith("m")) countM++;
            if (object.startsWith("A") || object.startsWith("a") || object.startsWith("E") || object.startsWith("e"))
                countAOrE++;
        }
        System.out.println(countM + "\n" + countAOrE);

        System.out.println("\n--------TASK-9--------");
        ArrayList<String> kitchenObjects =
                new ArrayList<>(Arrays.asList("Plate", "spoon", "fork", "Knife", "cup", "Mixer"));
        System.out.println(kitchenObjects);
        int countUpperCase = 0;
        int countLowerCase = 0;
        int countP = 0;
        int countStartAndEnfP = 0;

        for (String kitchenObject: kitchenObjects){
            if (Character.isUpperCase(kitchenObject.charAt(0))) countUpperCase++;
            if (Character.isLowerCase(kitchenObject.charAt(0))) countLowerCase++;
            if(kitchenObject.contains("p") || kitchenObject.contains("P")) countP++;
            if(kitchenObject.startsWith("P") || kitchenObject.startsWith("p") ||
                    kitchenObject.charAt(kitchenObject.length()-1) == 'P' || kitchenObject.charAt(kitchenObject.length()-1) == 'p')
                countStartAndEnfP++;
        }
        System.out.println("Elements starts with uppercase = " + countUpperCase +
                "\nElements starts with lowercase = " + countLowerCase +
                "\nElements having P or p = " + countP +
                "\nElements starting or ending with P or p = " + countStartAndEnfP);

        System.out.println("\n--------TASK-10--------");
        ArrayList<Integer> numbersForTasks10 = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78));
        System.out.println(numbersForTasks10);

        int countDivide10 = 0;
        int countEvenAndGreater15 = 0;
        int countOddAndLess20 = 0;
        int countLess15OrGreater50 = 0;

        for (int number: numbersForTasks10){
            if (number % 10 == 0) countDivide10++;
            if (number % 2 == 0 && number >= 15) countEvenAndGreater15++;
            if (number % 2 == 1 && number < 20) countOddAndLess20++;
            if (number < 15 || number > 50) countLess15OrGreater50++;
        }
        System.out.println("Elements that can be divided by 10 = " + countDivide10 +
                "\nElements that are even and greater than 15 = " + countEvenAndGreater15 +
                "\nElements that odd and less than 20 = " + countOddAndLess20 +
                "\nElements that are less than 15 or greater than 50 = " + countLess15OrGreater50);
    }
}