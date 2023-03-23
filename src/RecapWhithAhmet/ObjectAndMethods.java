package RecapWhithAhmet;

public class ObjectAndMethods {

    /*
    Possible interview Questions

    1-What do you know about Object?and tell me couple methods of it?

    -->Always go general to--> Deep
    -->Object is a representation of the class(blueprint)-->DNA,Car etc
    -->there are same useful method of object that i nuse to perform same action in my project
    *->.equals-->Comparison of two objects values.
    *->toString -->It is a wat to make the data into String format.(Arrays.toString)
    *->HashCode -->it gives you the location of data



    2-What is the difference between Object and Class?
    Class:is a bluePrint/template which you can create as many as you wanr
    Object:Is arepresentation of class/member->Instance of class(INStance=Object)
    Class:It is declared with Class Keyword
    Object:It is declared with NEw keyword

    3-How do you initialize the instance variables?
    ->There are some common ways to initializr the instance variables
    ->Constructor
    -->Methods(getters and setters)
    -->Object
    -->Directly declare and initialize

    4-What is the difference between local and instance variablews?

    Instance Variable
    -Belong to class
    -it has default value(nul,0,0.0,false)
    -It can have access Modifiers(private,public,protected


     */
  String name="Ahmet";
  int age=31;
  String eyeColor="black";
  String nationality;

    public ObjectAndMethods(String name, int age, String eyeColor, String nationality) {
        this.name = name;//instance variablre
        this.age = age;
        this.eyeColor = eyeColor;
        this.nationality = nationality;
    }
    public void run(int speed){
        int number=1;//local variable cannot have default values you have to initialize
        //public int number -> cannot use access modifiers for local variable
        System.out.println(number);
        System.out.println(speed);
    }

    public static void main(String[] args) {
        ObjectAndMethods MaleHuman=new ObjectAndMethods("Mehmet",35,"brown","Kyrgyz");//object-->representation of class
        System.out.println(MaleHuman.name);
        System.out.println(MaleHuman.age);//31                                               //instance of class
        MaleHuman.age=32;
        System.out.println(MaleHuman.age);//32
        System.out.println(MaleHuman.nationality);
        MaleHuman.nationality="Turkey";
        System.out.println(MaleHuman.nationality);
        //System.out.println(MaleHuman.);no direct call for local variable






    }

}

