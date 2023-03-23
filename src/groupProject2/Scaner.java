package groupProject2;

import java.util.Scanner;

public class Scaner {

    public static void main(String[] args) {


        String str= "Importance of Human";
        int firstIx = str.indexOf("e");
        char one = str.charAt(firstIx);
        System.out.println(firstIx + "--> index number of " + one);
        int secondIx= str.indexOf("f");
        char two =str.charAt(secondIx);
        System.out.println(secondIx + " --> index number of " + two);
        int thirdIx= str.indexOf("n", 8);
        char third =str.charAt(thirdIx);
        System.out.println(thirdIx + " --> index number of " + third);




    }
}
