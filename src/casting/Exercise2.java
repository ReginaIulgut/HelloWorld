package casting;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println('A' + 'b' + 20 + "Hello" + 2 + 1);
        /*
        'A' 65 +  'b' 98 = 163 -> + 20 = 183 -> "Hello"  + 2 + 1 concatenation
         "183 Hello21"
         */
        System.out.println('A' + 'b' + 20 + "Hello" + (2 + 1)); // "183 Hello3"
    }
}
