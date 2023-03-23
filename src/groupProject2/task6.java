package groupProject2;

import java.util.Scanner;

public class task6 {

        public static void main(String[] args) {

            System.out.println("Please enter one String value: ");
            Scanner input = new Scanner(System.in);

            String userText = input.nextLine().trim();

            System.out.println("Please enter starting number: ");
            int startNumber = input.nextInt();

            System.out.println("Please enter ending number: ");
            int endNumber = input.nextInt();

            String result = userText.substring(startNumber-1,endNumber);

            System.out.println("the value between the given starting and ending numbers: " + result);


        }
    }

