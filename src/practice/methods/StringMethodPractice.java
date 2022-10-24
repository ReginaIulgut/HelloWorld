package practice.methods;

public class StringMethodPractice {
/*
Create a public static method named as isCharExisting which will take a String, a char, and an index
it will return true if that char is existing in that string at the given index

Example:
"John" "o" 1 -> true
 */
    public static boolean isCharExisting (String str, char c, int index){
        return str.charAt(index) == c;
    }
    /*
Create a public static method named as isCharContained which will take a String, a char
it will return true if that char is existing in that string

Example:
"John" "o"  -> true
 */
    public static boolean isCharContained (String str, char c){
     return str.contains(c + "");
    }


}
