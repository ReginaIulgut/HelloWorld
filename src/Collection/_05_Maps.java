package Collection;

import java.util.HashMap;
import java.util.List;

public class _05_Maps {
    public static void main(String[] args) {
        /*
        Key         Value
        IL          Illinois
        WI          Wisconsin
        FL          Florida

        1           Vlad
        2           Alex
        3           Mike
        4           Vlad
         */

        HashMap<String, String> map = new HashMap<>();
        map.put("IL", "Illinois");
        map.put("WI", "Wisconsin");
        map.put("FL", "Florida");
        map.put("CA", "California");
        System.out.println(map);
    }
}
