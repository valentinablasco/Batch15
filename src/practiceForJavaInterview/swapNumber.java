package practiceForJavaInterview;

public class swapNumber {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        a = a + b;//15
        System.out.println(a);
        b = a - b;//5
        System.out.println(b);
        a = a - b;//10
        System.out.println(a);


        //Swap String
        String x = "Hello";
        String y = "CodeFish";

        x = x + y;
        System.out.println(x);
        y=x.substring(0,(x).length()-y.length());
        System.out.println(y);//hello
        x=x.substring(y.length());
        System.out.println(x);//codefish



    }
}