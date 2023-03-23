package ScannerPractice;

import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {

        Scanner scaner= new Scanner(System.in);
        // we will figure out initial of a person
        // John Deere--> Initial JD

        System.out.println("Please enter yoyr first name");
        //to take string data,nextLine() or next()

        char firstInitial =  scaner.nextLine().charAt(0);
        System.out.println(firstInitial);
        // please do above process for his last name
         System.out.println("Please enter your last name");
         char lastInitial =scaner.nextLine().charAt(0);
         System.out.println(lastInitial);

         //can you combine first and last initials
        System.out.println(""+ firstInitial + lastInitial);




    }
}
