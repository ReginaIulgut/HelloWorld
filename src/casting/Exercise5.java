package casting;

public class Exercise5 {
    public static void main(String[] args) {
        String s1 = "35", s2 = "10";

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        System.out.println("The sum is " + (i1 + i2));
        System.out.println("Difference is " + (i1 - i2));
        System.out.println("Absolut Diff is " + Math.abs(i1 - i2));
        System.out.println("Product is " + i1 * i2);
        System.out.println("Division is " + i1 / i2);

    }
}
