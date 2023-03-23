package groupProject2;

public class task2 {

    public static void main(String[] args) {


        int number=67835;
         int a1=number%10;//6
         System.out.println(a1);
         int a2=number / 10;
         System.out.println(a2);

         int b1=a2 % 10;//7
         System.out.println(b1);
         int b2 = a2 /10;
        System.out.println(b2);

        int c1=b2 % 10;//8
        System.out.println(c1);
        int c2 = b2 /10;
        System.out.println(c2);

        int d1=c2 %10;//3
        System.out.println(d1);
        int d2 = c2 /10;//5
        System.out.println(d2);
        System.out.println("the output is"+a1+b1+c1+d1+d2);




    }
}
