package mapPractice;

import java.util.HashMap;
import java.util.HashSet;

public class Practice1 {

    public static void main(String[] args) {


        HashMap<String, String> map = new HashMap<>();
        System.out.println(map);


        map.put("Alex","Smith");
        map.put("David","Brown");
        map.put("Mary","White");

        System.out.println(map);

        map.get("David");
        System.out.println(map.get("David"));
       String valueDavid= map.get("David");
        System.out.println(valueDavid);
    }

}

