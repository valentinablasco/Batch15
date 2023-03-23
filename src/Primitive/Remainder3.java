package Primitive;

public class Remainder3 {


    public static void main(String[] args) {

        int numberofcars=3;
        int numberofPartners=3;
  int eachPerson = numberofcars /numberofPartners;
        //ho many car each person will get?

        System.out.println(eachPerson);

        //haw many car/s will be left over?


        int leftOverCars= numberofcars % numberofPartners;
        System.out.println(leftOverCars);
//tv,465 dollars --> esch month paying 50,find last month's payment
          int tv$=465;
          int eachMonth$=50;
                int leftOver$ = tv$  % eachMonth$;
                System.out.println(leftOver$);

                System.out.println(tv$ / eachMonth$);

                double tv2$ =465.50;
                double eachMonth2$ = 15;
                System.out.println(tv2$ % eachMonth2$);


    }
}
