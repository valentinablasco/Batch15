package Exception;

public class Practis1 {
    public static void main(String[] args) {

        try {
            int number = 10;
            String str ="5";
          int a=  Integer.parseInt(str);
            System.out.println(a+10);

            int result = number / 0;//ArithmeticException
            System.out.println(result);
            System.out.println("I like math");


        }catch (ArithmeticException exception1){


        System.out.println("I caught Exception");
        System.out.println(exception1.getMessage());

    }
        System.out.println("I like java");
}}
