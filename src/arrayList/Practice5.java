package arrayList;
import Object.*;

import java.util.ArrayList;

public class Practice5 {
    public static  void main(String[] args) {
        /*
        Create an arraylist
        store some boottle object manipulate elements from the arraylist

         */

        ArrayList<Bottle>list=new ArrayList<>();

        Bottle b1=new Bottle(6);
        Bottle b2=new Bottle(16);
        Bottle b3=new Bottle(26);

        list.add(b1);
        list.add(b2);
        list.add(b3);
        System.out.println(list);
        System.out.println(list.get(0).size);
        System.out.println(list.get(1).liquidAmount);//

        //compare and find the difference between b1 and b2sizes

        //list.get(0).size
       // ( list.get(1).size-list.get(0).size)
        System.out.println(( list.get(1).size-list.get(0).size));//10
        //check the list and see
        //if any bootle size is more than print that"this bottle is  a large bottle"

        for (Bottle item:list){
            if (item.size >10){
                System.out.println(" This bottle is a large bottle " + item.size);
            }
        }
    }
}
