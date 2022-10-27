package homeworks;

import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {

        System.out.println("-------TASK-1-------\n");
        int [] numbers = new int[10];
        numbers[2] = 23;
        numbers[4] = 12;
        numbers[7] = 34;
        numbers[9] = 7;
        numbers[6] = 15;
        numbers[0] = 89;

        System.out.println(numbers[3] + "\n" + numbers[0] + "\n" + numbers[9] +
                "\n" + Arrays.toString(numbers));

        System.out.println("\n-------TASK-2-------\n");
        String[] str = new String[5];
        str[1] = "abc";
        str[4] = "xyz";
        System.out.println(str[3] + "\n" + str[0] + "\n" + str[4] +
                "\n" + Arrays.toString(str));

        System.out.println("\n-------TASK-3-------\n");
        int[] numbersForTask03 = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(numbersForTask03));
        Arrays.sort(numbersForTask03);
        System.out.println(Arrays.toString(numbersForTask03));

        System.out.println("\n-------TASK-4-------\n");
        String[] strForTask04 = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(strForTask04));
        Arrays.sort(strForTask04);
        System.out.println(Arrays.toString(strForTask04));

        System.out.println("\n-------TASK-5-------\n");
        String[] cartoons = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(cartoons));
        Arrays.sort(cartoons);
        System.out.println(Arrays.binarySearch(cartoons, "Pluto") >= 0);

        System.out.println("\n-------TASK-6-------\n");
        String[] cartoonsForTask06 = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cartoonsForTask06);
        System.out.println(Arrays.toString(cartoonsForTask06));
        System.out.println(Arrays.binarySearch(cartoonsForTask06, "Garfield") >= 0 &&
                Arrays.binarySearch(cartoonsForTask06, "Felix") >= 0);

        System.out.println("\n-------TASK-7-------\n");
        double[] doubles = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(doubles));
        for (double aDouble : doubles) {
            System.out.println(aDouble);
        }

        System.out.println("\n-------TASK-8-------\n");
        char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        System.out.println(Arrays.toString(characters));
        int countLetters = 0;
        int countLowerC = 0;
        int countUpperC = 0;
        int countDigits = 0;
        int countSpecialC = 0;

        for(char character : characters){
            if(Character.isLetter(character)) {
                if(Character.isUpperCase(character)) countUpperC++;
                    else { countLowerC++;
                }
                countLetters++;
            }
            else if (Character.isDigit(character)) countDigits++;
            else countSpecialC++;
        }
        System.out.println("Letters = " + countLetters +
                "\nUppercase letters = " + countUpperC +
                "\nLowercase letters = " + countLowerC +
                "\nDigits = " + countDigits +
                "\nSpecial characters = " + countSpecialC);

        System.out.println("\n-------TASK-9-------\n");
        String[] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        System.out.println(Arrays.toString(objects));
        int countUpperCh = 0;
        int countLowerCh = 0;
        int countBOrP = 0;
        int countBookOrPen = 0;

        for(String object : objects){
            if (Character.isUpperCase(object.charAt(0))) countUpperCh++;
            else countLowerCh++;
            if (object.toLowerCase().startsWith("b") || object.toLowerCase().startsWith("p")) countBOrP++;
            if (object.toLowerCase().contains("book") || object.toLowerCase().contains("pen")) countBookOrPen++;
        }
        System.out.println("Elements starts with uppercase = " + countUpperCh +
                "\nElements starts with lowercase = " + countLowerCh +
                "\nElements starting with B or P = " + countBOrP +
                "\nElements having \"book\" or \"pen\" = " + countBookOrPen);

        System.out.println("\n-------TASK-10-------\n");
        int[] arrayForTask10 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        System.out.println(Arrays.toString(arrayForTask10));

        int countMore10 = 0;
        int countLess10 = 0;
        int countEqual10 = 0;

        for (int numForTask10 : arrayForTask10){
            if (numForTask10 == 10) countEqual10++;
            else if (numForTask10 < 10) countLess10++;
            else countMore10++;
        }
        System.out.println("Elements that are more than 10 = " + countMore10 +
                "\nElements that are less than 10 = " + countLess10 +
                "\nElements that are 10 = " + countEqual10);

        System.out.println("\n-------TASK-11-------\n");
        int[][] arrayForTask11 = {
                {5, 8, 13, 1, 2},
                {9, 3, 67, 1, 0}
        };
        System.out.println("1st array is = " + Arrays.toString(arrayForTask11[0]) +
                "\n2nd array is = " + Arrays.toString(arrayForTask11[1]));

        int[] thirdArray = new int[5];
        for (int i = 0; i < thirdArray.length; i++){
            thirdArray[i] = Math.max(arrayForTask11[0][i], arrayForTask11[1][i]);
        }
        System.out.println("3rd array is = " + Arrays.toString(thirdArray));

    }
}
