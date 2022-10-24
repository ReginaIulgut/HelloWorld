package operators.increment_decrement_operators;

public class PreIncrementVsPostIncrement {
    public static void main(String[] args) {
        //Post-increment mostly used
        int num1 = 5;
        num1++; // increase it by one but assign it later num1 = 5
        System.out.println(num1); // 6

        //Pre-increment
        int num2 = 5;
        ++num2; // increase it by one and assign it now | num2 = 6
        System.out.println(num2); // 6

        // Understanding the difference
        byte b1 = 5, b2 = 5;
        System.out.println(b1++); // post - first it will be 5 next time when you call it 6
        System.out.println(++b2); // pre

        System.out.println(b1);
        System.out.println(b2);

    }
}
