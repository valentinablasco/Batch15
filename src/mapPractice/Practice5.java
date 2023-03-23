package mapPractice;

import java.util.HashMap;

public class Practice5 {

    /* String str="Soccer";
    count number of each lretter from the given string


    s-1

   o-1
    c-2
    e-1
    r-1
     */
    public static void main(String[] args) {
        String str = "Soccer is the best sport";
        HashMap<String, Integer> map = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            String str1 = "" + str.charAt(i);
            if (map.containsKey(str1)) {
                map.put(str1, map.get(str1) + 1);
            } else {
                map.put(str1, 1);
            }
        }
            System.out.println(map);

        }
    }


