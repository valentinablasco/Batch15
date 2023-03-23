package Exception;

public class Practice2 {

    public static void main(String[] args) {



        try {

            System.out.println("First");
            String str="b15";
            int result=15/0;//ArithmeticalException
            System.out.println("Second");

            int number=Integer.parseInt(str);
            System.out.println("Third");
        }catch (ArithmeticException e){
            System.out.println("Catch");
        }catch (RuntimeException e1){
            System.out.println("Catch 2");
        }
try{
        String str ="Last";
        String reversed="";
        for ( int i=str.length()-1;i>=0;i--){


            reversed += str.charAt(i);

        }
        System.out.println(reversed);

        }catch (StringIndexOutOfBoundsException e){
        System.out.println(e.getMessage());
        System.out.println(e.getCause());


        }
    }}
