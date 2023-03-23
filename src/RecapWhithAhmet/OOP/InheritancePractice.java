package RecapWhithAhmet.OOP;

public class InheritancePractice {

    /*
    Posible Interview Questions:

    1- What do you know about inheritance and how do you inherit two classes?

    -->Inheritance is a way to make a connection (relationship) between classes.
    -->We need to use "EXTENDS" keyword to do this connection.

    2-Why do you use inheritance in your project?

    --We need inheritance because:We would like to have less amount of code
    (reduce the amount of execution),(save time),(save memory),(save money).

    -->It will be more safe and efficient to maintain.
    -->It will look more professional

     */
    public static void main(String[] args) {
        Porsche porsche=new Porsche();
        porsche.price=300000;
        System.out.println(porsche.price);
        System.out.println(porsche.tiers);


        Bugatti bugatti=new Bugatti();


    }
}
