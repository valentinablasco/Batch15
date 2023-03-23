package groupProject;

public class task5 {


    public static void main(String[] args) {


        int quarter =5
                ;
        int dime=4;
        int nickel =3;
        int penny=2;


        double result =0.25*quarter+0.1*dime+nickel*0.05+ 0.01*penny;

        double roundRes=Math.round(result*100.0)/100.0;
        System.out.println(roundRes);
    }
}
