package Primitive;

public class Casting {

    public static void main(String[] args) {


        // implicit

        int num =23;
        long numL = num;

        //explicit
        int count = 25;
        short countSh = (short)count;

        System.out.println(count);//25
        System.out.println(countSh);//25byte n

        int number = 127;
        System.out.println("number -->"+ number);
        byte numberBt = (byte)number;
        System.out.println("Number is the byte type" + numberBt);

        double weight =3.4;
        int weight1 = (int)weight;

        int example =(int) 25.6;



        byte b1 =23, b2 =12;
        byte sum1 =(byte) (b1+b2);
        short sum2 = (short) (b1+b2);

        //compaund assigments --> +=,-=,*=,/=;%=;

        byte result1 =12;
        result1 += example;


        example -=1.2;









    }
}
