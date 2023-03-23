package ifStatement;

import groupProject2.Scaner;

import java.time.MonthDay;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter an integer number between 1 and 5");

        int number= scanner.nextInt();
        if (number == 1){
            System.out.println("It is Monday");
        }
     if (number == 2) {
         System.out.println("It is Tuesday");
     }
         if (number == 3){
             System.out.println("It is Wednesday");
         }
         if (number == 4){
             System.out.println("It is Thursday");
         }
         if (number == 5){
             System.out.println("It is Friday");
         }

         if (number>5 ||number<1){
             System.out.println("there is no matching day for entry");
         }

         /* get a string from user
         -check if the given string starts with letter 'h' and the lengh of the string is more than 10

         -print -->"This is what  i am looking for!"""
          */
         System.out.println("Please enter a text");
         scanner.nextLine();
          String text = scanner.nextLine();
          if (text.startsWith("h")   &&   text.length()> 10){
             System.out.println("This is what  i am looking for!");
         }
     }
    }


