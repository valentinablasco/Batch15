package Loops;

import java.util.Scanner;

public class WhilePractice7 {

    public static void main(String[] args) {

        /*
        find sum of number between 10and 15
        10+11+12+13+14+15
        "sum of the numbersc between 10 to 15 is 75
         */
        int num1 = 10, num2 = 15, sum = 0;
        while (num1 <= num2) {

            //sum=sum+num1;
            sum += num1;
            num1++;


        }
        System.out.println("sum of the numbers between 10 to 15 is:" + sum);


        //find the even number from 1 to 15

        int a = 1, b = 15, total = 0;

        while (a < b) {
            if (a % 2 == 0) {
                total = total + a;

            }
            a++;//2
        }
        System.out.println(total);
    }
}