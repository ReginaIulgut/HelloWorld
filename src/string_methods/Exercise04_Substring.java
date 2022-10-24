package string_methods;

public class Exercise04_Substring {
    public static void main (String[] args){
        String s1 = "The best is Java";
        String s2 = s1.substring(12);
        System.out.println(s2);

        System.out.println(s1.substring(s1.indexOf("Java")));

        System.out.println(s1.substring(s1.length() - 4));

        String str1 = "Java is an object-oriented programming language";
        String str2 = str1.substring(0, 4);
        String str3 = str1.substring(11, 26);
        System.out.println(str2);
        System.out.println(str3);
    }
}
