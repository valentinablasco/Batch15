package oop.Inheritance1;

public class Cat extends DomesticAnimal {

    String name;

    @Override
    public void play() {
        System.out.println(name +" is playing ");
    }

    public  void jump(){
        System.out.println(" Cat is jumping");

    }
    //public void  hunt(){
       // System.out.println(" Cat is hunting");
    //Commenting out private hunt method below
    // Since it was having wider access modifier
    //parent class.here it is not compiling
    //since we made it private.
    }
