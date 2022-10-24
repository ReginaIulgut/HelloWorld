package string_methods;

import utilities.ScannerHelper;

public class Exercise06_middleCharOrChars {
    public static void main(String[] args) {
        /*
        Alisa -> e  -> s.charAt(s.length() / 2) mid for odd Strings
        Regina -> gi    -> s.substring(s.length() / 2 - 1, s.length() / 2 + 1)

         */
        String name = ScannerHelper.getAName();
        if (name.length() % 2 == 0) {
            System.out.println("The middle characters of the name is "
                    + name.substring(name.length()/2-1, name.length()/2+1));
        }
        else {
            System.out.println("The middle character of the name is " + name.charAt(name.length()/2));
        }
    }
}
