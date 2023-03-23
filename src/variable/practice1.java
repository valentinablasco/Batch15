package variable;

public class practice1 {

   public static void main(String[]args)  {


      // I want to add numbers 3,5,2  and show the total in the console



         System.out.println( 3 + 5 + 2);

   // variables

 int redApples =3;
 int greenApples =5;
 int  yellowApples =2;

  // number of Red apples is 3

 System.out.println(redApples); //it will show 3
 System.out.println( "redApples");

 //I want to print ---> Number of Red apples is 3
       System.out.println("number of Red apples is" +3);
       System.out.println("Number of Red apples is" + redApples);


       //create a variable and name it as "total"
       // get the value for this "total

       int total = redApples + greenApples + yellowApples;
       System.out.println("Total number of apples is" + total);

// create variables for prices of each apple type
       //  each red-> 2,each  greens->3, each Yellow -> 4
       // create variable for total cost;
       // show that how much you need to pay for all together

       int redPrice  = 2;
       int greenPrice =3;
       int yellowPrice =4;
       int totalPrice = redApples + redPrice +  greenApples + greenPrice + yellowApples + yellowPrice;
       System.out.println( "You need to pay" + totalPrice);


    //   int redApples =11; you connot create multiple variable by using some name


  // int =12; you connot create by using some name more than once



    }







}
