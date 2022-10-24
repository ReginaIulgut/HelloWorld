package arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        String[][] students = {
                {"Alex", "Regina"},
                {"Ali", "Mehmet", "Alex"},
                {"Newer", "Abdallah"},
        };
        System.out.println(students[0][1]);
        System.out.println(students[1][1]);

        System.out.println(Arrays.toString(students[0])); // Alex Regina
        System.out.println(Arrays.toString(students[1]));
        System.out.println(Arrays.toString(students[2]));

        for (String[] student : students) {
            System.out.println(Arrays.toString(student));
        }

        System.out.println(Arrays.deepToString(students));

        System.out.println(students.length); // 3

        for (String[] group : students){
           for(String student : group){
               System.out.println(student);
           }
        }

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                System.out.println(students[i][j]);
            }
        }

    }
}
