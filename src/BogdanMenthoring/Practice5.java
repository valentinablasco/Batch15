package BogdanMenthoring;

import java.util.HashSet;

public class Practice5 {
    public static void main(String[] args) {

        String sp="13";
        String price="5";
        String items="1 2 3 1 4 4";
        System.out.println("How much did you paid");
        String[] fcf=items.split(" ");

        //Split
        //for loop
        // reasign
        //based on size-->result
        HashSet<String> ggf=new HashSet<>();
        for (int i=0;i<fcf.length;i++){
            ggf.add(fcf[i]);
        }
        System.out.println((ggf.size() - 2)*5);


    }
}
