package groupProject2;

public class task22 {

    public static void main(String[] args) {

        int number = 12345;
        int a5 = number % 10; // a5 = 6;

        int b1 = number / 10; //5387
        int a4 = b1 % 10; // a4 = 7

        int b2 = b1 / 10; //538
        int a3 = b2 % 10; //a3 = 8

        int b3 = b2 / 10; //53
        int a2 = b3 % 10; //a2 = 3

        int b4 = b3 / 10; //5
        int a1 = b4 % 10; //a1 = 5

        int reverse = a5*10000 + a4*1000 + a3*100 + a2*10 + a1*1;
        System.out.println(reverse);





    }
}
