package string_methods;

public class _13_replace_Method {
    public static void main(String[] args) {
        /*
        - return
        - returns a String
        - non- static
        - -There are overloaded methods, one takes 2 chars to be replaced and the other takes 2 Strings to be replaced
         */

        String s = "Can I can a can";
        String s1 = s.replace('c', 'x');

        System.out.println(s1); // Can I xan a xan
        System.out.println(s.replace("can", "xxx"));
        System.out.println(s.toLowerCase().replace("can", "xxx"));
        //IMPORTANT
        String str1 = "John";
        str1 = str1.replace("o", "ooooo");
        String str2 = "loop";
        str2 = str2.replace("", "s");

    }
}
