package groupProject;

public class task  {
    public static void main(String[] args) {

        int dollarCent =236;
        int quarter=25;
        int dime=10;
        int nickle =5;
        int penny =1;

        int a1 = dollarCent/quarter;//9
        System.out.println(a1+"a1");
        int a =dollarCent  % quarter;
        System.out.println(a);

        int b = a/dime;//1
        System.out.println(b);
        int c= b%dime;//1
        System.out.println(c);

        int d= c/nickle;//00
        System.out.println(d);

        int c1=c/penny;//1
        System.out.println(c1);

        System.out.println(dollarCent +"will make"+a1+"quarters"+ b+"dime" + d + "nickles and"+c1+"pennies");




    }


}
