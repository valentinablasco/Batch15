package oop.Inheritance1;

public class DomesticAnimal extends Animal{
    boolean hasToy;

    public void play(){

        System.out.println("Domestic is playing");

    }

    void jump(){
        System.out.println(" D is Jumping");
    }
    private  void hunt(){
        System.out.println(" D is Hunting");
    }

}
