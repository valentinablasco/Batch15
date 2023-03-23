package oop.finalPractice;

public class Shirt {
    double price=11.99;
    String color;
    String size;

    public  void sale(){
        System.out.println("Sale");
    }

        final  public void dye(){
            System.out.println("Changing color of Shirt");

    }
    final static  public void dye(final String color){
        System.out.println("Changing color of SHIRT to " +color);

    }
    @Override
    protected void finalize(){
        System.out.println("**************");
    }


}
