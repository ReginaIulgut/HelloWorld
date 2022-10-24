package loops.while_loops;

public class Exercise02_PrintNumbersDividedByThree {
    public static void main(String[] args) {
        int start = 1;
        while(start <= 100){
            if(start % 3 ==0) System.out.print(start + " - ");
            start++;
        }
    }
}
