package Loops;

import java.util.Scanner;

public class WhilePractice3 {
    public static void main(String[] args) {

        /*get number from user and find the  positiv divisorz of the given number
        10--->1,2,5,10
        15--->1,3,5,15
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an integer number");
        int number=scanner.nextInt();
        int divisor=1;
        //number%divisor==0
        while (divisor<number){

            //number%divisor==0

                    if (number%divisor==0){
                        System.out.println(divisor);
                    }
                    divisor++;

        }







       // int division=10 /1;
        //System.out.println(division);
       // int division1=10/2;
        //System.out.println(division1);
       // int division2=10/5;
       // System.out.println(division2);
        //int division3=10/10;
        //System.out.println(division3);


    }

}
