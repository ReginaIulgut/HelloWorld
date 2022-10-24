package loops.while_loops;

public class Exercise01_PrintOutNumbers {
    public static void main(String[] args) {
        int start = 1;
        while(start <= 10){
            if(start % 2 == 0) System.out.println(start);
            start++;
        }
    }
}
