package ifStatement;

import java.util.Scanner;

public class PracticeTask {
    public static void main(String[] args) {

        /*ask for city is -->Chicago
         *what is your school name ?
         * if school is Thechtorial -->you are lucky to have EFE
         * if school is not Thechtorial --> please come and visi Thechtoriale
         * if the city is not Chicago -->please come to Chicago and visit us!
         */
        System.out.println("Please enter your City?");
        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine();
        if (city.equalsIgnoreCase("Chicago")) {

        } else {
            System.out.println("What is your school name?");
            String school = sc.nextLine();

            if (school.equalsIgnoreCase("techtorial")) {
                System.out.println("You are lucky");
            } else {
                System.out.println("please come and visit TECHTORIAL");
            }




        }

    }
}

