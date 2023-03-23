package mapPractice;

import java.util.HashMap;
import java.util.Map;

public class Practice4 {

        /*create a method that will take a map as parameter<Sting,String>
        this method will add message to each key as follows

        "......is the best key"
         */
    public static void bestKey(Map<String,String>map){
        for (String key:map.keySet()) {
            System.out.println(key+"....is the best key");
            //print out value
            System.out.println(map.get(key));

        }

    }
    public static void main(String[] args) {
        HashMap<String, String> map= new HashMap();
        System.out.println(map);
        map.put( "Alex","7");
        map.put( "Sam","6");
        map.put( "Tom","10");
        bestKey(map);


    }
}
