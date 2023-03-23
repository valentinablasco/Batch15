package ifStatement;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        //get a single letter fro user
        //when the letter from t she user is
        //"M" or "m"--> it is Monday
        //'T'nor 't'

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter a letter");
        char letter =   scanner.nextLine().charAt(0);

        if( letter =='M' || letter=='m'){
            System.out.println("It is Monday");
        }
        if (letter=='T' || letter=='t'){
            System.out.println("It is Tuesday");
        }
        if (letter =='W'|| letter=='w'){
            System.out.println("It is Wednesday");
        }
        // cover the cases when the incoming letter is not one of the expected letters

        if (letter !='M' && letter!='T' && letter !='W' && letter !='w'){
            System.out.println("Invalid entry");
        }
        ///////int number =1234

         //If (number){system.out.printline("hello world);

    }
}
