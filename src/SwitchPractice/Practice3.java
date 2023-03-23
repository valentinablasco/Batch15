package SwitchPractice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        /* ask user for their favorit fruit
        -strawbery,mango,apple,grape
         */
        /*"we have ypur favorit fruit"
        /*Sorry! we do not have your favorit food
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your favorit food? Please enter");
        String answer = scanner.nextLine();
        ;
        switch (answer) {
            case "MANGO":System.out.println("We have your favorit food:"+ answer);break;
            case "APPLE":System.out.println("We have your favorit food:"+ answer);break;
            case"Grape":System.out.println("We have your favorit food:"+ answer);break;
            case"Banana":System.out.println("We have your favorit food:"+ answer);break;
                case "strawberry":

                System.out.println("We have your favorit food:"+ answer);break;

            default:

                System.out.println("Sorry !we do not have your favorit fruit.."+answer);break;
        }
    }
}






