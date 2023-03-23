package Loops;

public class DoWhilePractice1 {

    public static void main(String[] args) {
        //"***" for ten times
        int num = 1, last = 10;
        while (num <= last) {

            System.out.println("***");
            num++;
        }
        num = 1;
        last = 10;
        do {
            System.out.println("$$$");
            num++;

        } while (num > last);

        int x = 5, y = 20;
        do {
            System.out.println("Hello,it is Do-While");

            y--;
        } while (y > x);
        System.out.println(y);
        //=========
        do {
            System.out.println("Hello,it is Do-While-2");
            y--;


        } while (y > x);//false

        do {
            System.out.println("y-->"+y);
        } while (4 < 0);//False

    //}while (5<2);
           // System.out.println("Test1");false






        }

    }

