package arrayList;

import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {

        // create an arraylist and store 6 car brands
        // print out brand of evry care from the list
        ArrayList <String>brands=new ArrayList<>();
        ArrayList list2=new ArrayList<>(5);
        ArrayList list3=new ArrayList<>(brands);
        ArrayList<String> list=new ArrayList<>();

        System.out.println(list);
        brands.add("a");
        brands.add("b");
        brands.add("c");
        brands.add("d");
        brands.add("e");
        brands.add("f");
        System.out.println(brands);

        for (String car:brands){
            System.out.println(car+"@yahoo.com");
        }

        for (int i=0;i<brands.size();i++){
            System.out.println(brands.get(i) + "@gmail.com ");
        }
        System.out.println("=========");
        filter(brands);


    }
    // create a methode that will take an arrayList as parameter
    //parameter arraylist should hold String type elements
    //that method will show only elements which have letter 'a' in it
    public  static void filter(ArrayList<String>list){

        for (int i=0;i<list.size();i++){
           if (list.get(i).contains("a")){

                System.out.println(list.get(i));
            }
        }
    }



}
