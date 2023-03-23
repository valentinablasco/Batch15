package ifStatement;

import java.util.Scanner;

public class ElseIfPractyice2 {
    public static void main(String[] args) {
        /*check and print out if the givin number is positive number,negativ number or zero

         */
        System.out.println("enter an integer number");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        if (number<0){
            System.out.println("Your number is negative");
        }else if (number>0){
            System.out.println("Your number is positive");
        }else
            System.out.println("your number must be Zero");
        System.out.println("************");
        System.out.println("********************");
    }
}

