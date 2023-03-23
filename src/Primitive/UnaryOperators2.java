package Primitive;

public class UnaryOperators2 {

    public static void main(String[] args) {


        double d=8.7;
        d++;
        System.out.println(d);//9.7

        int a=5;
        int b=++a;//6
        System.out.println(b);
        int c=a+ ++b;//7

        // c=? 7.8
        System.out.println(b);
        System.out.println("c is>>"+c);

        c= c++ + --a - 2;
        System.out.println("c is now" + c);//16


        int e = c+ 10;
        System.out.println(e);

        int k=8, t= ++k,m= k+t,x= ++m;
        System.out.println(--x - --k);

        //======== deal onDD
        /*
        get one dozen of donut for 15you get one dollar discount on your next purchase
        show ypur next purchase payment amount

         */
        int  payment= 15;
        System.out.println(payment); // today$ 15, (show 15,value14)
        System.out.println("Next Payment" + payment);

        int payment1 =15;
        System.out.println(--payment1+"$ payment now with applied discount");







    }
}
