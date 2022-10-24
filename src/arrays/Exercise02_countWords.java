package arrays;

public class Exercise02_countWords {
    public static void main(String[] args) {
        String sentence = "I love arrays";
        /*
        int counter = 0;
        for (int i = 0; i < sentence.length(); i++) {
        if (sentence.charAt(i) == ' ') counter++;
        }
        System.out.println(counter);
         */

        int spaceCounter = 0;
        char[] s = sentence.toCharArray();
        for (char element : s){
            if(element == ' ') spaceCounter++;
        }
        System.out.println(spaceCounter + 1);

        System.out.println("\n-----Solution 2 with split method-----\n");

        System.out.println(sentence.split(" ").length); // 3

    }
}
