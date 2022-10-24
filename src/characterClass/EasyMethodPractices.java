package characterClass;

import javax.crypto.spec.PSource;

public class EasyMethodPractices {
    public static void main(String[] args) {
        String s1 = "93 dune lakes";
        System.out.println("String: " + s1 + " has " + countLetter(s1));

        String s2 = "TechGlobal";
        System.out.println("String \"" + s2 + "\" has " + countUpperCase(s2));
    }

    public static int countLetter(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(i)) {
                counter++;
            }
        }
        return counter;
    }


    public static int countUpperCase(String st) {
        int counter1 = 0;
        for (int i = 0; i < st.length(); i++) {
            if (Character.isUpperCase(i)) {
                counter1++;
            }
        }
        return counter1;
    }
}

