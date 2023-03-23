package ifStatement;

import java.util.Scanner;

public class NestedTask2 {
    public static void main(String[] args) {
        /*do you know java?
        yes/no
        Testing tool -selenium
        API testing
        SQL
        -->HIRED<--
         */

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Do you now Java yes/no ");
        String java = Scanner.nextLine().toLowerCase();

        if (java.equals("yes")) {
            System.out.println("Do you know Selenium?yes/no");
        }
        String selenium = Scanner.nextLine().toLowerCase();
        if (selenium.equals("yes")) {
            System.out.println("Do you know API testing");
        }
        String api = Scanner.nextLine().toLowerCase();

        if (api.equals("yes")) {

            System.out.println("Do you know SQL?yes/no");
        }
        String sql = Scanner.nextLine().toLowerCase();

        if (sql.equals("Yes")) {

            System.out.println("You are Hired");

        } else {
            System.out.println("Please learn API");
        }
    }
}











