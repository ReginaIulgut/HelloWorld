package loops.fori_loops;

public class Exercise03_PrintEvenNumbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    // for (int i = 0; i <= 10; i+2) // start and end point could be dynamic
}
