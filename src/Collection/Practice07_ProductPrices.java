package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Practice07_ProductPrices {
    public static void main(String[] args) {

       /*
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1000, "iPhone");
        map.put(1300, "MacBook Pro");
        map.put(1500, "iMac");
        map.put(200, "Airpods");
        map.put(700, "iPad");

        System.out.println(map.lastKey() + " is the most expensive with the price of " + map.get(map.lastKey()));

        */

        /*
        1. Store the items in a HashMap
        2. Find the max price value from HashMap values
        3. Loop and find the item which has the value equals max price value
         */

        HashMap<String, Double> products = new HashMap<>();
        products.put("iPhone", 1000.0);
        products.put("MackBook Pro", 1300.0);
        products.put("iMac", 1500.0);
        products.put("airPods", 200.0);
        products.put("iPad", 700.0);

        double maxPrice = new TreeSet<>(products.values()).last();

        for (Map.Entry<String, Double> entry : products.entrySet()) {
            if(entry.getValue() == maxPrice){
                System.out.println(entry.getKey() + " is the most expensive with the price of " + entry.getValue());
                break;
            }
        }
    }
}
