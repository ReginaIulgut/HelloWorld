package practice.methods;

public class MethodPractices {
    public static void main(String[] args) {
        printCharIncluded("Regina");
        printCharIncluded("");
        printCharIncluded("Grff");
        sameEnd("h");
        sameEnd("AdvaD");
        sameEnd("bdfst");

    }
    public static void printCharIncluded (String str){
        if (str.isEmpty()){
            System.out.println("Length is zero");
        }
        else {
            System.out.println("Length is = " + str.length() +
                    "\nFirst char is = " + str.charAt(0) +
                    "\nLast char is = " + str.charAt(str.length() - 1) +
                    "");}


        if (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i") ||
                str.toLowerCase().contains("o") || str.toLowerCase().contains("u")){
            System.out.println("This String has vowel");
        }
        else {
            System.out.println("This String does not have vowel");
        }
    }
    public static void printHasVowel (String str){
        if (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i") ||
                str.toLowerCase().contains("o") || str.toLowerCase().contains("u")){
            System.out.println("This String has vowel");
        }
        else {
            System.out.println("This String does not have vowel");
        }
    }

    public static void printMiddle (String str){
        if (str.length() < 3) {
            System.out.println("String is less than 3");
        }
        else {
            if( str.length() % 2 == 0){
                System.out.println(str.substring(str.length()/2-1, str.length()/2+1));
            }
            else System.out.println(str.charAt(str.length()/2));
        }
    }
    public static void sameEnd (String str){
        if (str.length() < 2){
            System.out.println("Length is less than 2");
        }
        else{
            if (str.substring(0,2).equalsIgnoreCase(str.substring(str.length()-2))){
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
        }
    }
}
