package practiceForJavaInterview;

import java.util.HashMap;
import java.util.Map;

public class CountFruit {
    public static void main(String[] args) {
        String[]fruits ={"Apple","Banana","Peach","Apple","Orange","Strawberry","Banana","Apple","Cherry","Orange"};

        Map<String, Integer> fruitCount = new HashMap<>();

        for (String fruit : fruits) {
            if (fruitCount.containsKey(fruit)) {
                fruitCount.put(fruit, fruitCount.get(fruit) + 1);
            } else {
                fruitCount.put(fruit, 1);
            }
        }
        System.out.println(fruitCount);
    }
}


