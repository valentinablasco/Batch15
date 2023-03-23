package Loops;

import java.util.Scanner;

public class whilePractice5 {
    public static void main(String[] args) {
        /*get a positiv number from user
        and create a multiplication table for given number for up to 10s

        6*1=6
        6*2=12
        6*3=18
        6*10=60

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please give a positive integer number");
        int userNumber=scanner.nextInt();
        System.out.println(6+"*"+1+"="+6*1);
        int number=1;

        while (number<=10){
            System.out.println(userNumber+"*"+number+"="+userNumber*number);
            number++;
        }

    }
}
