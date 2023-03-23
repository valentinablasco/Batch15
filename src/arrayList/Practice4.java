package arrayList;

import java.util.ArrayList;

public class Practice4 {

    public static void main(String[] args) {
        /*
        Create an arraylist to store 5 city names
        implement a logic to print only city names that  have 4 or more letters
         */
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Chicago");
        cities.add("New York");
        cities.add("Miami");
        cities.add("Zion");
        cities.add("Dubai");
        System.out.println(cities);//[Chicago, New York, Miami, Zion, Dubai]


        for (String city : cities) {
            if (city.length() >= 6) {
                System.out.println(city);
            }
        }
        System.out.println("--------");
        for (int i=0;i<cities.size();i++){
            if (cities.get(i).length()>=6){
                System.out.println(cities.get(i));
            }
        }

    }
}