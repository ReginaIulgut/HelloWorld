package practice.methods;

import javax.jws.soap.SOAPBinding;

public class ReturnMethodPractices {
    public static void main(String[] args) {
        System.out.println(ReturnMethodPractices.findDifference(9, -3));
        System.out.println(ReturnMethodPractices.findDifference(9.3, -3.43));
        System.out.println(ReturnMethodPractices.findDifference(4.55, 3.543));
        System.out.println(ReturnMethodPractices.isIncluded("John", "John Doe"));
        System.out.println(ReturnMethodPractices.isIncluded("red", "green, blue, red"));
        System.out.println(ReturnMethodPractices.isIncluded("red", "green, blue"));
    }
    /*
    Create public static method named as "findDifference"
    it will take two values and returns the difference
    Example:
    6, 9 -> 3
    4, 1 -> 3
    99,23 -> 76
     */
    public static int findDifference (int num1, int num2){
        return Math.abs(num1 - num2); }
    public static double findDifference (double num1, double num2){
        return Math.abs(num1 - num2); }
    /*
    Create a public static method named as isIncluded which takes two String values, and return true if
    the small string is inside the other one.
     */
        public static boolean isIncluded (String str1, String str2) {
            if (str1.length() > str2.length()) {
                if (str1.contains(str2)) return true;
                else return false;}
                if (str1.length() < str2.length()) {
                    if (str2.contains(str1)) return true;
                        else return false;
                }
            return false;
        }
}
