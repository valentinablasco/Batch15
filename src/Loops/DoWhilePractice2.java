package Loops;

import java.util.Scanner;

public class DoWhilePractice2 {
    public static void main(String[] args) {
        //use do-While to solve
        /*
        get to positive integer number from user and fiind the sum of the range

        2,7-->3+4+5+6=18
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two  positive integer number");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();



    num1++;//increasing num1 by 1
    int sum=0;
    do{
        sum=sum+num1;
        num1++;

    }while (num1<num2);
        System.out.println(sum);
    }
}