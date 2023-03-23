package oop.abstraction.obstraction2;

public class Bird implements CanFly {

    public void fly (){
        System.out.println("Bird is in the sky");
    }
    public void landing(double spead){
        System.out.println("Bird is landing with speed of"+spead);
    }
    protected void eat(){
        System.out.println("Bird eats");
    }
    public void abcd(){
        System.out.println("&&&&&&&&&&&&&");
    }

}
