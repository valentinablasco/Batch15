package groupProject;

public class task8 {

    public static void main(String[] args) {

        int DollarInCent =197;
        int quarter =25;
        int dime =10;
        int nickel =5;
        int penny =1;

        int quarter1 =DollarInCent /quarter;
        System.out.println(quarter1);
        int num2=DollarInCent%quarter;//22
        System.out.println(num2);
        int num3=num2/dime;//2
        System.out.println(num3);
        int num4= num3%dime;
        System.out.println(num4);
        int num5=num4/nickel;
        System.out.println(num5);
        int num6=num5 %nickel;
        System.out.println(num6);



    }
}
