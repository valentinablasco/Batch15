package RecapWhithAhmet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListPractice {

    /*
    Posible interview questions:

    1-What is yhe difference between List and Array?
    -->you can go to the ArraysPractice concept to  get the answer

    2-*What is the difference between ArrayList and LinkedList?

    -->is a part of Collection and it is used for Storage(Object)
    -->ArraList-->It is a way to store Object and access these object with a specific methods.(Get)
    -->LinkedList-->It is a way  to store Objects and access these objects with a specific methods.(Get)


    -->To be honest I do not use LinkedList in my project but as much as known there is execution time difference for accessing the data from the List.0 sSHOW OFF:

    *****-->tHE REACHING OUT THE ELEMENTS inside of the list is more efficient and faster in ArrayList.


    ArrayList<Object>    -->arraylist.get(0)-->0.02
    LinkedList<Object>-->Linkedlist.get-->(0.04)

    ***->When you do any manipulation (changing value,replacing,inserting,removing)
    at this moment LinkedList will be faster.


    -->If you want to get more details,there is Youtube video.
    (What is the difference between Linkedlist and ArrayList)
     */

    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        ArrayList list2=new ArrayList<>();
        LinkedList list3=new LinkedList<>();
        List list4=new LinkedList();
        list2.add("Hello");//long way and do not  use it one by one.-->loops
        System.out.println(list2.get(0));
        List<String>names= Arrays.asList("Ahmet","Mehmet");
        for (String name:names);
        System.out.println(names);
    }
}
