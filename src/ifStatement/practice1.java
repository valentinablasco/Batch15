package ifStatement;

public class practice1 {

    public static void main(String[] args) {
        int money = 100;
        int item$ = 250;

        System.out.println("First Print before if statement");

        if (money > item$) {
            System.out.println("you are buying Item");

        }
        System.out.println("Another print after if Statement");

        int item2$ = 99;
        if (money > item2$) {


            System.out.println("I am buying ITEM2");


        }

        //you have another option as using your credit card if the money is not enough

        boolean creditCard = true;
        if (money > item$ || creditCard == true) {
            System.out.println("you are using 2 different option to buy ITEM");
            //Ask user to give a integer number 1 and 5,print out day name for related number


        }

    }
}

