package ScannerPractice;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("How is the weather this morning?");
       String answer= input.nextLine();

        System.out.println(answer);

//ask user for the name of the day
        //store the name of the day
        //print a message as
       // ;"so,it a --- rainy---Sunday---


        System.out.println("What is today?");
        String day = input.nextLine();
        System.out.println("\"So, it  is  a "+ answer+""+ day+"!\"");

        //next()--> will take String till first space
        System.out.println("which city is this");
      String city= input.nextLine();
        System.out.println("\"So ,it  is a "+ answer + "" + day + " in "+ city);

        //ask user for zipcode,storeit,and double check with user buy printing back
        System.out.println("What is your zipcode");

        int zipcode  =  input.nextInt();
        System.out.println("it this correct zipcode?" + zipcode);
        System.out.println(zipcode +100);


    }
}
