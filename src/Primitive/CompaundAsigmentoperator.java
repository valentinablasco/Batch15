package Primitive;

public class CompaundAsigmentoperator {

    public static void main(String[] args) {



        int cars = 2;
        System.out.println(cars);

        cars=cars +1;
        System.out.println(cars+ "number of cars after first purchase");


        cars+=1;

        System.out.println(cars+"number of cars after second purchase");

        cars -=1; //cars=cars-1
        System.out.println(cars + "after selling one car");

        //sharin cars
        cars /=2;
        System.out.println(cars +"After sharing with another person");

        cars /=2;
        System.out.println(cars +"After sharing single car");

        int count =25;
        count %=7; // ---->count =count % 7; //7

        System.out.println(count);


    }
}
