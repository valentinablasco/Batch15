package RecapWhithAhmet;

public class StaticInstanceBlock {
    /*
    Posible interview Questions:
    1-What is static as a keyword and why do you use it?

    -->Static is a keyword)is a way  to make the methods accessible"Whithout creating anh Object"from that class.
    -->The disadvantage of usingbstatic keyword "YOU CANNOT OVERRIDE THE METHODS"
    SIDE NOTR:YOU CANNOT OVERRIDE"PRIVAT,STATIC,FINAL METHODS


    2-What is static block?
    -->It is the block that can be called once(One Time It Works)
    -->It always executes First


    3-What is static as a variable keyword?
    -->It makes the variable belong to the class
    -->It is sharable(common)==>common for all objects
    -->It can be accessed by other  classes without creating an object.Just with the name of class.


    4-What is instance block?
    It is a block that can be called as many as you have objects.

     */
    public static void main(String[] args) {
        StaticExample staticExample = new StaticExample();
        staticExample.run();
        staticExample.speak();
        //To be able to call static Method.I can use just className(System suggested)
        //StaticExample.age=32;
        StaticExample ahmet=new StaticExample();
        System.out.println(ahmet.money);//10000
        ahmet.withdrawmoney();
        System.out.println(ahmet.money);//9800

        StaticExample mehmet=new StaticExample();
        mehmet.withdrawmoney();//9800-->9600
        mehmet.withdrawmoney();//9600-->9400
        System.out.println(mehmet.money);



    }
}

