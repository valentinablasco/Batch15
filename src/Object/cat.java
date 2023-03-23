package Object;

public class cat {
    String name;//declared an instance variables
    String color;
    int age;
    int foodAmount = 20;//declared and initialized an instance variable


    // create a method that will just print out

    //"..Tom is Sleaping
    public void sleep() {
        System.out.println(name + "   is sleeping");
    }


    //create run method that will return an integer number
    //that is indicating how many miles user run
    public int run() {
        System.out.println(name + "  is running ");

        return 3;
    }

    //create a method that will return  a String value-->"....tom..is walking to ...destination..."
    //destination should come for parameter

    public String walk(String destination) {
        return name + " is walking to  " + destination;
    }

    // create a method that initialize color of the cat
    public void setColor(String color1) {
        color = color1;
    }

    // create amethode that will return color of cat
    public String getColor() {
        return color;
    }
//create a method that will print and return all properties of cat
    public String allInf(){
        System.out.println(name + "-" + color + "-" + age + "-"  +foodAmount );
        return name + "-" + color +"-" + age +"-" + foodAmount;
    }

     //set the age of cat ,get the age of cat by using method
    //once you use method get age of cat print out" In 10 yers your age will be..."

    public void setAge(int age1) {
        age = age1;
    }
    public int getAge(){
        return age;


    }

}




