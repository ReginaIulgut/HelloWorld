package casting;

public class ExplicitCasting {
    public static void main(String[] args) {

        int age = 25;
        byte b = (byte) age;
        System.out.println(b); // 25
        //BUT, we will lose data if bigger primitive holds a data that cannot be stored in small one
        int num1 = 5000;
        byte num2 = (byte) num1; //it seems okay to compiler data loss
        System.out.println(num2); // -120

    }
}
