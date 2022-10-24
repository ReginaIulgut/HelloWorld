package string_methods;

public class _11_startsWith_endsWith_Methods {
    public static void main(String[] args) {
        /*
        - return
        - returns a boolean
        - non - static
        - There are overloaded methods, but we will always use the one with one args
         */

        String s = "TechGlobal";
        System.out.println(s.startsWith("T"));  // true
        System.out.println(s.startsWith("t"));  // false
        System.out.println(s.startsWith("Tech")); // true
        System.out.println(s.endsWith("Global")); //true

        /*
        IMPORTANT
        all true
         */
        String city = "Chicago";
        System.out.println(city.startsWith("Chicago"));
        System.out.println(city.endsWith("Chicago"));
        System.out.println(city.startsWith(""));
        System.out.println(city.endsWith(""));

    }
}
