package conditional_statements.switch_statement;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SwitchWithInteger {
    public static void main(String[] args) {
        /*
        DRESS CODE
        1. Monday -> Blue
        2. Tuesday  -> Red
        3. Wednesday  -> Green
        4. Thursday  -> Yellow
        5. Friday  -> Orange
        6. 7. Weekend -> Free
         */

        System.out.println("LADDER IF-ELSE\n");
        int day = 4;
        if (day == 1) System.out.println("Monday and Blue");
        else if (day == 2) System.out.println("Tuesday and Blue");
        else if (day == 3) System.out.println("Wednesday and Green");
        else if (day == 4) System.out.println("Thursday and Blue");
        else if (day == 5) System.out.println("Friday and Orange");
        else if (day == 6 || day == 7) System.out.println("Weekend and Free");
        else System.out.println("THIS IS NOT VALID ENTRY");

        System.out.println("\nSWITCH WAY\n");
        switch (day){
            case 1:
                System.out.println("Monday and blue");
                break;
            case 2:
                System.out.println("Tuesday and blue");
                break;
            case 3:
                System.out.println("Wednesday and Green");
                break;
            case 4:
                System.out.println("Thursday and Blue");
                break;
            case 5:
                System.out.println("Friday and Orange");
                break;
            case 6:
            case 7:
                System.out.println("Weekend and Free");
                break;
            default:
                System.out.println("THIS IS NOT VALID ENTRY");
        }
    }
}
