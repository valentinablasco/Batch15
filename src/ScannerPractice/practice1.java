package ScannerPractice;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {

        //i will print my first name

        String firstname="Valentina";
        System.out.println("My first name is"+ firstname);

        // i want to get lastname from user print --> "your last name is :
        Scanner scanner = new Scanner(System.in);
        String lastName=scanner.nextLine();
        System.out.println(lastName);

        System.out.println("your last name is:"+ lastName);

       lastName=lastName + "Blasco";
       System.out.println(lastName);

       //get name of the city from user and say "Alex Brown,you are living in

        String city= scanner.nextLine();

        System.out.println("Valentina"+""+"Blasco"+""+"you are living "+ city);





    }
}
