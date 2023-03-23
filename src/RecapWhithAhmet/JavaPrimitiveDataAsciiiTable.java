package RecapWhithAhmet;

public class JavaPrimitiveDataAsciiiTable {
    /*
    Possible Interviu Questions:
    1-What is Java and what do you know about JDK,JVM,JRE?

    Java is: programing language.To make a connection between computer and people.

    JDK:Java Development kit that has some libraries wich support the "application development"
    JRE:Java Run Time Enviroment wich is responsible for "Execution".
    JVM:Java Virtual Machine-->Is a virtual machine which is responsable for"converting the Byte code to Binary Code(1,0)


    PRIMITIVE DATA:It is a way to store the data in it .It doesn't take up too much space in memory.
    Whole number                             Decimal number:                Condition         Character
    -> Byte                                   -->Float                       ->boolean        ->char
    ->Short                                   -->Double
    ->Int***
    ->Long*

    ASCII TABLE:It is a table for all the characters(alphabet,digits,symbol etc)

    short a=5
    short b=6
    short c=(short) (a+b-2)//casting
    sout(c)


     */
    public static void main(String[] args) {

    char letter=65;
    char letter2='g';
    int number='g';
        System.out.println(number);//103
        System.out.println(letter2-letter);//103-65-->38
        System.out.println(letter2);//103 or g
        System.out.println(letter);//A  or compile time,65

        int number1=5;
        int number2=21;
        boolean condition =number1>number2;
        boolean condition2=number2>number1;
        System.out.println(condition2);//true
        System.out.println(condition);// false

        double amount=24.5d;
        double amount2=0.235545454;
        System.out.println(amount2);
        System.out.println(amount);



        int allAmount=(int) (amount+amount2);
        System.out.println(allAmount);




    }
}
