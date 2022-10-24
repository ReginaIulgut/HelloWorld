package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise10_CountCharactersUsingScanner {
    public static void main(String[] args) {
        String str = ScannerHelper.getAName();
        int counter = 0;
        for (int i = 0; i <= str.length()-1; i++) {
            if(str.charAt(i) == ('l') || str.charAt(i) == ('L')) counter ++;
        }
        System.out.println(counter);
    }
}
