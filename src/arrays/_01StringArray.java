package arrays;

import java.util.Arrays;

public class _01StringArray {
    public static void main(String[] args) {
        // 1. Declare a Sting array
        String[] countries = new String[3];
        // 2. Assigning value
        countries[1] = "Spain";
        countries[2] = "Belgium";
        // 3. Print a specific index from array 
        System.out.println(countries[0]); // null
        System.out.println(countries[1]); // Spain
        System.out.println(countries[2]); // null
        // 4. Printing an array
        System.out.println(Arrays.toString(countries));
        // 5. Update existing element
        countries[1] = "France";
        System.out.println(Arrays.toString(countries));
        // 6. Getting the length of an array - how many elements - 3
        System.out.println(countries.length); // 3
        //7. Printing each element separately
        for (int i = 0; i <= 2 ; i++) {
            System.out.println(countries[i]);

        }


    }
}
