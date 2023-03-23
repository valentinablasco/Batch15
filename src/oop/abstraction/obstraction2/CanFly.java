package oop.abstraction.obstraction2;

public interface CanFly {

    int TAIL = 1;
    int WINGS = 2;


   public void fly();


        void landing ( double speed);

        //all methods and variables are public static and abstract

    public default  void printInfo(){

        System.out.println(this.TAIL+"----"+ this.WINGS);

    }
    private void  abcd(){
        System.out.println("+++++++++++");
    }


    }




