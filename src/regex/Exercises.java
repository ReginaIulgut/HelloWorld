package regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Exercises {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[\\d]{3}-[\\d]{2}-[\\d]{4}", "000"));
        System.out.println(Pattern.matches("\\([\\d]{3}\\)-[\\d]{3}-[\\d]{4}", "(850)-586-8802"));
        //NNN-NN-NNNN


        String str = "How much wood would a wood chuck chuck if a wood chuck could chuck wood";
        System.out.println(str.replaceAll("wood", "****"));

        String str1 = " abc 123 $#^_ ";
        System.out.println(str1.replaceAll("[^a-zA-Z0-9]", ""));
        System.out.println(str1.replaceAll("[\\W]", ""));


        System.out.println(Pattern.matches("[A-Za-z]{2,} [A-Za-z]{2,}","John Doe"));
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]+\\s[A-Z]{1}[a-z]+", "John Doe"));


        String c = "A1b2C3";
        System.out.println(Arrays.toString(c.replaceAll("[^A-Za-z]", "").toCharArray()));
        System.out.println(Arrays.toString(c.replaceAll("[\\D]","").split("")));


    }
}
