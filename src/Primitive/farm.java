package Primitive;

public class farm {

    public static void main(String[] args) {

        int cows =15, chickens = 45, cowsLeghs=4, chickenLegs=2, total;


      total = ( cows *cowsLeghs) + (chickens * chickenLegs );

      System.out.println("The total number of the legs in the farm is"+ total);


      //if a single cow cost 1345.86 and a chicken cost 10.99
        //calculate total worth of animals and show the result as>>the worth of the animals is

        double eachCow$= 1345.86, eachChicken$=10.99,worth;
        worth = cows * eachCow$ + chickens *eachChicken$;
        System.out.println("The worth of the animals is" + worth);

        //if you and your partner will share the cost ,how much each person will get

        double share = worth /2;
        System.out.println(share);
    }
}
