package Turnary;

public class Practice1 {
    public static void main(String[] args) {
        //booleanCondition ? value1:value2;

        int a=16,b=7;
     int result=   a<b ? a+b : a*b;

        System.out.println(result);//13

      String  result1=  a !=b ?  "Addition":"Multiplication";
        System.out.println(result1);

        System.out.println( a>= b+9 ? 'c':"check");

        //String result3 =a>=b+9?'c':"check;since data tupes of the option are different //you cannot store


        String str1="I am so lucky";
        String str2="It is going great";
        String day="Sunday";
        System.out.println( day.equals("Monday") ? str2:str1);
        System.out.println("a-->"+a);
        System.out.println("b-->"+b);

        System.out.println(a > b ? ++a + ++b : --a + --b);//25

        System.out.println("a-->"+a);
        System.out.println("b-->"+b);

        System.out.println(day.equals("Monday") ? str2 : a>b ? ++a + ++b : --a + --b) ;//27
        System.out.println(day.equals("Monday")? (a>=b+9 ? 'c':"check"):(a>b ? ++a + ++b:--a + --b));

        System.out.println(day.indexOf(a>b ? ++a + ++b:--a + --b));//-1




    }
}
