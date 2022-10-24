package casting;

public class PrimitivesToString {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 10;

        System.out.println(n1 + n2); // 15 primitive
        System.out.println("" + n1 + n2); // 510 String
        System.out.println("" + (n1 + n2)); // 15 String

        System.out.println(String.valueOf(n1) + String.valueOf(n2)); // "5" + "10" -> 510
    }
}
