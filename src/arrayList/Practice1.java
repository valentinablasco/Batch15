package arrayList;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {

        ArrayList list1=new ArrayList<>();
        ArrayList list2=new ArrayList<>(5);
        ArrayList list3=new ArrayList<>(list1);
        ArrayList<String> list=new ArrayList<>();

        System.out.println(list);
        list.add("tomatoes");
        System.out.println(list);
        list.add("cucumbers");
        list.add("patatoes");
        list.add("cherries");
        list.add("lettuce");
        System.out.println(list);
        System.out.println(list.get(4));//lettuce
        String item=list.get(3);
        System.out.println(item);//cherries
        list.add(3,"bananas");
        System.out.println(list);
        System.out.println(list.get(3));

        //list.add(9,apple");//IndexOutOfBoundsException
        list.add(6,"apples");
        System.out.println(list);
      //  add()an element,add()an element to a specific index,get()

        // size()
      int size=  list.size();
        System.out.println(size);
        // set--> it will replace the element at given index
        list.set(4,"Dressing");
        System.out.println(list);

        //remove
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());

        list.remove("bananas");
        System.out.println(list);
        System.out.println(list.size());


        //Clear method
        list.clear();
        System.out.println(list);

        System.out.println(list.size());
        ArrayList<String>list5=new ArrayList<>();
        list5.add("bread");
        list5.add("chesse");
        list5.add("mayo");

        list.addAll(list5);
        System.out.println(list);
        list.add("grape");
        System.out.println(list);




    }
}
