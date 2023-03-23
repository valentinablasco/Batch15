package SwitchPractice;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        /*get an integer number from user
        if the number is 1-->
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter an integer number");
        scanner.nextInt();

        int number= 1;
        switch (number){

            case 1:
                System.out.println("It is IT department");
                break;
            case 2:
                 System.out.println("It is HR department");
                 break;
            case 3:
                System.out.println("It is Help Desk");
                break;
            case 4:
                System.out.println("It is accounting");
                break;
            default:
                System.out.println("invalid number");
                break;

        }
    }
}
