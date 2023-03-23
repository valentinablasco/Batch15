package Primitive;

public class BooleanPractice {
    public static void main(String[]args){

        //true/ false
        boolean isCold = true;
        boolean isBreak;
        isBreak = false;
        isCold = false;
        System.out.println(isBreak);
        System.out.println(isCold);//false

       // boolean isStudying = "yes"; you cannot assign yes or no to boolean data type(compile time error

        //2=2-->yes
        boolean result1 = 2 ==2;

        System.out.println(result1);//true
        boolean result2 = 2 ==3;
        System.out.println(result2);//show false

        // makes the boolean value to opposite true <--> false
        boolean isLightOn = true;
        System.out.println(isLightOn); //true

        System.out.println(!isLightOn);// ? falls
        System.out.println(isLightOn); //


    }
}
