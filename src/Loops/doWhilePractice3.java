package Loops;

import java.util.Scanner;

public class doWhilePractice3 {
    public static void main(String[] args) {
        /*
        get a positive number from user
        for that given number,create a star tree like following
        -->user enters-->5
        *
        **
        ***
        ****
        *****
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positiv  integer number");
        int number = scanner.nextInt();
        String str="*";

        do {
            System.out.println(str);//**
            str=str.concat("*");

            number--;

        } while (number > 0);



    }
}