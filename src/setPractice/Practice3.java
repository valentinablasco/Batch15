package setPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Practice3 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("mac");
        list.add("mac");
        list.add("mac");
        list.add("Acer");
        list.add("Lenovo");

        HashSet<String> set=new HashSet<>(list);
        System.out.println("List--->"+list);
        System.out.println("SET-->"+set);

        //Interator

        Iterator interator=set.iterator();

        while (interator.hasNext()){

            System.out.println("****"+interator.next());
        }
        System.out.println("---------");
        Iterator iteretor1=list.iterator();
        while (iteretor1.hasNext()) {

            //System.out.println("$$$"+iteretor1.next();


        }
    }

}
