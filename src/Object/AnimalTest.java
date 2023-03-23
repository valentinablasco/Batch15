package Object;

import JavaFirst.HelloWorld;

public class AnimalTest {

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        System.out.println(animal1);//
        System.out.println(animal1.name);
        System.out.println(animal1.color);
        System.out.println(animal1.age);
        animal1.name = "Simba";
        System.out.println(animal1.name);
        animal1.color = "brown";
        animal1.age = 2;
        System.out.println(animal1.color);
        System.out.println(animal1.age);
        //create another object,inititializing all instance variables by using new object
        //print out those new value

        Animal animal2 = new Animal();
        animal2.name = "smurfic";
        animal2.color = "white";
        animal2.age = 3;
        System.out.println(animal2.name);
        System.out.println(animal2.color);
        System.out.println(animal2.age);


        Animal cat = new Animal();
        System.out.println(cat.age);//
        cat.age = 3;
        cat.name = "Ginger";
        cat.color = "Orange";
        System.out.println(cat.age);
        System.out.println(cat.name);
        System.out.println(cat.color);
        System.out.println(animal1.gender);
        cat.gender = "Male";
        System.out.println(cat.gender);
        System.out.println("====================");

        cat.eat();
        animal1.eat();
        //create a method that will print out all proprieties of every animal
        System.out.println("===================");
        cat.printInfo();
        animal1.printInfo();
        animal2.printInfo();
        System.out.println("==================");
        Animal dog=new Animal();
        System.out.println(dog.energyLevel);//0
        dog.eat();

        System.out.println(dog.energyLevel);//100

        System.out.println("??Cat's Energy??"+cat.energyLevel);

        //create a run method
        //when an animals runs
        //it will use 20 percent of energu
        // implement the logical and show leftover energy

        //include name of the animal in the method to let user know who is running
        cat.run();
        cat.run();
        cat.run();

        cat.eat();
        Shape helper=new Shape();
        helper.perimiterCalculator(12,17);
        HelloWorld abcd=new HelloWorld();

        //I want to have a random number so that i can add 1000 tomit in this class
        Student student=new Student();
        int number = student.hourCreator();

        System.out.println(number+1000);


    }




        }







