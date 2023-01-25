package homeworks;


import java.util.*;

public class Homework16 {

    // TASK-1
    public static TreeMap<Integer, String> parseData(String str){

        str = str.replaceAll("[{]|[}]", " ").trim();
        String[] str11 = str.split(" ");

        ArrayList<Integer> keys = new ArrayList<>();
        ArrayList<String> values = new ArrayList<>();
        TreeMap<Integer, String> result = new TreeMap<>();

        for (int i = 0; i < str11.length; i++) {
            if(i % 2 != 0) values.add(str11[i]);
            else keys.add(Integer.parseInt(str11[i]));
        }
        for (int i = 0; i < keys.size(); i++) {
            result.put(keys.get(i), values.get(i));
        }
        return result;
    }

    // TASK-2
    public static double calculateTotalPrice1(Map<String, Integer> fruits) {
        double totalSum = 0;

        Map<String, String> prices = new HashMap<>();

        prices.put("Apple", "$2.00");
        prices.put("Orange", "$3.29");
        prices.put("Mango", "$4.99");
        prices.put("Pineapple", "$5.25");

        for (String product : fruits.keySet())
            for (int i = 0; i < fruits.get(product); i++)
                totalSum += Double.parseDouble(prices.get(product).substring(1));
        return (double) Math.round(totalSum * 100) / 100;
    }

    // TASK-3
    public static double calculateTotalPrice2(Map<String,Integer> shoppingList) {

        Map<String, Double> priceList = new HashMap<>();
        priceList.put("Apple", 2.00);
        priceList.put("Orange", 3.29);
        priceList.put("Mango", 4.99);

        Set<Map.Entry<String, Double>> itemsPriceEntries = priceList.entrySet();
        Set<Map.Entry<String, Integer>> shoppingListEntries = shoppingList.entrySet();
        double result = 0;

        for (Map.Entry<String, Integer> item : shoppingListEntries) {
            for (Map.Entry<String, Double> itemPrice : itemsPriceEntries) {

                if(item.getKey().equals(itemPrice.getKey()) && item.getKey().equals("Apple")) {
                    if(item.getValue() % 2 == 0) result += item.getValue() * 1.5;
                    else result += item.getValue() * 1.5 + 0.5;
                }
                else if(item.getKey().equals(itemPrice.getKey()) && item.getKey().equals("Mango")) {
                    if (item.getValue() > 3) result += item.getValue() * itemPrice.getValue() - (item.getValue() / 4) * itemPrice.getValue();
                    else result += item.getValue() * itemPrice.getValue();
                }
                else if(item.getKey().equals(itemPrice.getKey())) result += item.getValue() * itemPrice.getValue();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("\n------TASK-1-----");
        Map<Integer, String> result = parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London");
        System.out.println(result + "\n");

        System.out.println("\n------TASK-2-----");
        Map<String, Integer> Task2Items1 = new HashMap<>();
        Task2Items1.put("Apple", 3);
        Task2Items1.put("Mango", 1);
        double totalPrice1Task2 = calculateTotalPrice1(Task2Items1);
        System.out.println("Total Price 1: $" + totalPrice1Task2);

        Map<String, Integer> Task2Items2 = new HashMap<>();
        Task2Items2.put("Apple", 2);
        Task2Items2.put("Pineapple", 1);
        Task2Items2.put("Orange", 3);
        double totalPrice2Task2 = calculateTotalPrice1(Task2Items2);
        System.out.println("Total Price 2: $" + totalPrice2Task2);

        System.out.println("\n------TASK-3-----");
        Map<String, Integer> items1 = new HashMap<>();
        items1.put("Apple", 3);
        items1.put("Mango", 5);
        double totalPrice1Task3 = calculateTotalPrice2(items1);
        System.out.println("Total Price 1: $" + totalPrice1Task3);

        Map<String, Integer> items2 = new HashMap<>();
        items2.put("Apple", 4);
        items2.put("Mango", 8);
        items2.put("Orange", 3);
        double totalPrice2Task3 = calculateTotalPrice2(items2);
        System.out.println("Total Price 2: $" + totalPrice2Task3);
    }
}
