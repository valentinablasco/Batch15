package oop.Inheritance1;

public class zoo {
    public static void main(String[] args) {
        Animal animal1=new Animal();
        System.out.println(animal1.color);

        WildAnimal wild=new WildAnimal();
        System.out.println(wild.color);

        Lion lion=new Lion();

        System.out.println(lion.color);
        System.out.println("++++++");
        lion.color="Brownish";
        System.out.println(lion.color);

        DomesticAnimal domestic=new DomesticAnimal();
        System.out.println(domestic.color);

        Cat cat=new Cat();
        System.out.println(cat.color);

        animal1.eat();
        wild.eat();
        domestic.eat();
        cat.eat();

        animal1.name="Father";
        System.out.println(animal1.name);//false
        System.out.println(wild.name);//false

        animal1.eat();
        lion.name="Simba";
        lion.eat();

        System.out.println("============");
        animal1.sleep();
        wild.sleep();
        lion.speak();
        System.out.println(domestic.hasToy);
        System.out.println(cat.hasToy);
        domestic.play();
        cat.play();

        System.out.println("=========");
        System.out.println(domestic.name);
        System.out.println(cat.name);
        System.out.println("========");

        domestic.name="Jerry";
        cat.name="Tom";
        domestic.play();
        cat.play();

        lion.play();


    }
}
