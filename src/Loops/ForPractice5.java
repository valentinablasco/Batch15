package Loops;

public class ForPractice5 {

    public static void main(String[] args) {
        //print ouy alphabet as uppercase letters
        //A,B,C,,,,Z
        System.out.println("++++++++++++");
        for (char  ch='A';ch<'Z' ;ch++){

            System.out.print(ch+"*");
            if (ch=='Z'){
                System.out.print(ch);
            }else {
                System.out.print(ch+"*");
            }
        }

        System.out.println("++++++++++");
        //print out digits bu separating them with $(0 to9)


        for (char ch='0';ch<='9';ch++){
            if (ch=='9'){
                System.out.println(ch);
            }else{
                System.out.println(ch+"-$$$-");
            }
        }
    }
}
