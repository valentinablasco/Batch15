package Object;

public class CatTest {
    public static void main(String[] args) {
        cat tom=new cat();
        System.out.println(tom.name);
        tom.name="Tom";
        tom.age=3;
        tom.color="Black";
        System.out.println(tom.foodAmount);//20
        tom.foodAmount=40;
        System.out.println(tom.foodAmount);//40
   tom.sleep();
   cat cat2=new cat();
   cat2.sleep();//null is sleeping
        tom.run();//
        int number=tom.run();
        System.out.println(number);//3
        System.out.println("=============");
        System.out.println(tom.run());//

        //however many miles tom runs ,give him 500 dollars per milet
        System.out.println(tom.run()*500);


       String message1 =tom.walk("west");
        System.out.println(message1);
        System.out.println(tom.walk("up"));

        //methods with void return types cannot be called in sout
        //System.out.println (tom.sleep());
        tom.setColor(  "Blue" );
        System.out.println(tom.color);
        System.out.println(cat2.color);//null
       String colarTom= tom.getColor();
        System.out.println(colarTom);//blue
        System.out.println(tom.color);
        System.out.println(tom.getColor());

        String info=tom.allInf();

        System.out.println(info);

        tom.setAge(12);
        tom.getAge();
        System.out.println("In 10 years your age will be " + (tom.getAge()+10));
    }

}
