package RecapWhithAhmet;

public class StaticExample {
    public  int money=31;
    public int weight=210;

    public  void speak  () {
        System.out.println("Ahmet is speaking");
    }

    public void run() {
        System.out.println("Ahmet is running");
    }
    public  void withdrawmoney(){
        money-=200;
        System.out.println("Good Joob,you "+
        " are getting younger ");

    }
    static {
        //this will no Matter what
        //execute first
        System.out.println("Hey i am a "+" static block "+" Please " + "let me go first");
    }
    {
        //this will come after static block
        System.out.println(" Hey I am a " + "instance block");
    }

}

