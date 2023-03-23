package Primitive;

public class ComparisonOperators1 {

    public static void main(String[] args) {

        //==

        int a=4,b=4;
        System.out.println(a == b);


        boolean ressult1 = a == a;
        System.out.println(ressult1);
        System.out.println(ressult1 == true);//

        boolean result2 = ++a == 2+3;
        System.out.println(result2);

        System.out.println(7== 8); //false

        //!= Nor equal
        int num1 =6, num2=6;
      boolean result3=num1 != num2;

      System.out.println(result3);//false
        System.out.println(num1 !=2);// true

        char letter = '9';
        System.out.println(letter != 9);//true

        char letter2= 'A';
        System.out.println(letter2 !=65);// false
        System.out.println(letter2==65);//true

        System.out.println('t' != 'T');// True

        //> greater than operator

        System.out.println(0>1);
        boolean result4= 0>1;
        System.out.println(result4);// false

        System.out.println((10*2)>(9+10));// true

        System.out.println('A'>'a');//65>97===>false

        //<---less than
        System.out.println(67<90);

        double d1=1.25, d2=12.5;
        boolean result5 =d1<d2;
        System.out.println(result4 != result5);//true

        // >= greater yhan or equal  to

        System.out.println(7>=7);//true

        int count =34;
         count += count;
        int count2 = count  +count;
        boolean result6 = count>= count2;
        System.out.println("Result6 is"+ result6);//false


        // <= ---Less or equals


        System.out.println(4<=8);//true
        System.out.println(6<=6);//true
        System.out.println(9<=8);//false
        System.out.println('a'<='b'); // true
        System.out.println("hi"=="bye");//false

        System.out.println("hi"=="hi");//true


        System.out.println("hi"!="hi");
        System.out.println("hi"!="hi");//false

        int x ='b';
        int y =x;
        System.out.println(x > y);









    }
}
