package ifStatement;

import java.util.Scanner;

public class ElseTask {

    public static void main(String[] args) {
        //ask user they have driver licens
        //if the answers is "yes"-->you are great
        /// if the answer is somethinghwlse -->DMV is next door,please visit;
        System.out.println("Do you have driver's licence?yes/no");
        Scanner input =new Scanner(System.in);
      String answer =  input.nextLine();
      if (answer.equalsIgnoreCase("Yes")){
          System.out.println("you are great");
      }else{
          System.out.println("DMV is next door, please visit");


          //get the amount of purchase from user as Dollar amount
          //when the amount is $1000-->give user of discount and show final payment amount after discount applied
      }
    }
}
