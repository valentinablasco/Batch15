package oop.inheritance3;

public class Car extends Vehicle {
    String model;
    String engineType;




    public Car(){
        super("Camry", 2013, "Toyota");

    }
    @Override
    public void move(){
        System.out.println("Car is moving");
        super.move();
    }
    /*@Override
     protected Car accelerate(){
        System.out.println("Car is accelerating");
       // return (Car)new Vehicle("", 5, "");
        */

    @Override
    protected Vehicle accelerate(){
        System.out.println(super.model);//going to get to parent class, find the model and bringing back to me
        //this.model = super.model; <---or
        // System.out.println(model);<---
        return  new Vehicle("", 5, "");
        // by using super keyWord we can reach something from the Parent class

    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Y",2023,"Tesla");
        vehicle.move();
        Object i =  vehicle.accelerate();
        System.out.println( i );
        String str = (String) vehicle.accelerate().toString();
        System.out.println( str);
        Integer i1 = (Integer) vehicle.accelerate();
        System.out.println(  i1 * 5 );

        int i2=(Integer)vehicle.accelerate();
        System.out.println(i2+10);
        System.out.println("==================");
        Car car =new Car();
        car.move();

        System.out.println("===========");
        car.accelerate();
        Vehicle v= car.accelerate();
        System.out.println(v);
        System.out.println(v.model);
        System.out.println(v.yer);

        Car car1=(Car) car.accelerate();
        System.out.println(car1.yer);
    }

}














