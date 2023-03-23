package SwitchPractice;

public class Practice1 {

    public static void main(String[] args) {
        int count=2;
        switch (count){

            case 5 :
                System.out.println("RED");
                System.out.println("red");
                System.out.println("reD");
                int number =9;
                System.out.println(number*number);
                break;
            case 2:
                System.out.println("Yellow");
                break;
            case 1 :
                System.out.println("White");
                break;
            case 10 :
                System.out.println("Pink");

            default:
                System.out.println("NO COLOR");





        }
        System.out.println("This is end of switch statement");


    }
}
