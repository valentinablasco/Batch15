package BogdanMenthoring;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HomeWork {

    //by usig maps count how many letter are in the  String.
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("apple","1");
        map1.put("peach","2");
        map1.put("banana","3");

        Map<String,String>map2=new HashMap<>();
        map2.put("cherry","4" );
        map2.put("lemon","5" );
        map2.put("strawberry","6");

        Map<String,Map<String,String>>map3=new HashMap<>();
        map3.put("map1",map1);
        map3.put("map2",map2);
        System.out.println(map1);
        System.out.println(map2);


        System.out.println(map3.get("map1").get("banana"));

        Map<String,String>firstLevel=map3.get("map1");
        firstLevel.get("banana");



    }
}