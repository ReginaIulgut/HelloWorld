package loops;

public class Exercise05_FindTheIndexOf {
    public static void main(String[] args) {
        System.out.println(frontAndBack("abcxxxxabc"));



    }
    /*
    Create a public static method named as findFirstIndexOf() and it will take a String,
    and a char then it will return the index of the first occurrence of the char.
    If char doesn't exist in the String then return -1.
     */

    public static int findFirstIndexOf (String s, char c) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }

    public static int findLastIndexOf (String st, char ch) {
        for (int i = st.length()-1; i >= 0; i--) {
            if(st.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
    }

    public static String clearChar (String s, char c) {
        String newS = "";
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != c) {
                newS += s.charAt(i);
            }
        }
        return newS;
    }

    public static String clearWord (String s, String str) {
        if (str.length() > s.length()) {
            return "";
        }
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if (!s.substring(i).startsWith(str)) {
                newS += s.charAt(i);
            } else {
                i += str.length() - 1;
            }
        }
        return newS;
    }

    /*
    "adcxxxxabc" -> "abc"
    "abxxxxab" -> "ab"
    "axxxa" -> "a"
    */
    public static String frontAndBack (String s){
        String newS = "";
        for (int i = 0; i < s.length() / 2; i++) {
            if(s.endsWith(s.substring(0, i +1))){
                newS += s.substring(0, i +1);
            }
        }
        return newS;
    }

    // supporting char method
    public static int countChar (String s,char c){
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) counter++;
        }
        return counter;
    }

    /*
    "I love Java" -> v
    "Banana" -> a
    "Python" -> P
     */
    public static char mostRepeatedChar (String s){
        char mostRepeated = ' ';
        int mostAmountOfRepetition = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) continue;
            if(countChar(s, s.charAt(i)) > mostAmountOfRepetition){
                mostRepeated =s.charAt(i);
                mostAmountOfRepetition = countChar(s, s.charAt(i));
                }
            }
            return mostRepeated;
        }
    }
