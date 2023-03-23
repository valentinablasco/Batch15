package ScannerPractice;

import java.util.Scanner;

public class Moneytransaction {
    public static void main(String[] args) {
        //David wants to deposit his money into his bank account
        //-he already got $200 in his account
       // -he got three different paychecks ($480, $600 and $350)
       // -he can only deposit one paycheck at a time
      //  -after he got his money in the account
            //    - he bought a phone for $599 and headphone for $299
          //      - calculat his final money in his account
        //open a new class under scanner package and name it as "MoneyTransaction"
        Scanner scanner = new Scanner(System.in);

        double balance=200;

        System.out.println("Please enter first deposit amount");
      double firstCheck =scanner.nextDouble();
      balance=balance+firstCheck;
      System.out.println("Please enter second deposit amount");

      double secondCheck =scanner.nextDouble();
      balance=balance+secondCheck;

      System.out.println("Please enter third deposit amount");
      double trirdCheck=scanner.nextDouble();
      balance += trirdCheck;
      System.out.println("Your balance after deposit is" + balance);

        System.out.println("please enter phone price");
        double phone$ =scanner.nextDouble();
        balance -=phone$;

        System.out.println("Please enter headphone price");
        double headphone$ = scanner.nextDouble();
        balance -= headphone$;

        System.out.println("After buying some items your balance is" + balance);



    }

}
