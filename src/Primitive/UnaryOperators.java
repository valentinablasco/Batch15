package Primitive;

public class UnaryOperators {

    public static void main(String[] args) {

     int studentNumber =23;
     System.out.println(studentNumber);//23

     studentNumber++;
     System.out.println(studentNumber);//24
        ++studentNumber;
        System.out.println(studentNumber);
      ///========
        System.out.println("===========");
        System.out.println(studentNumber++);//25
        System.out.println(studentNumber);//26

        System.out.println("===========");
        System.out.println(++studentNumber);//27

        System.out.println(studentNumber);
        //==========
        studentNumber++;
        System.out.println(studentNumber);//28

        System.out.println(studentNumber++);//show 28,value became29 behind the  scene
        System.out.println(studentNumber);//29

System.out.println("Decrement");
        int number=12;
        ///preDecrement
        --number;
        System.out.println(number);
        //postDecrement
        number--;
        System.out.println(number);

        //difference btw pre and post
        System.out.println(--number);//show 9 and valui is 9
        System.out.println("++++");
        System.out.println(number--);//show9 and value is 8
        System.out.println(number);//8












    }
}
