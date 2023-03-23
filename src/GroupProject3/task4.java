package GroupProject3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        System.out.println("Please enter one string value:");
        Scanner name =new Scanner(System.in);

        String value = name.nextLine().trim();

        System.out.println("Please enter the starting number:");

        int startNumber=name.nextInt();

        System.out.println("Please enter the ending number");

        int endnumber= name.nextInt();

        String newValue =value.substring(startNumber-1,endnumber);

        System.out.println(newValue);



    }
}
