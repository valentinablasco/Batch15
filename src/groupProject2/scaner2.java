package groupProject2;

import java.util.Scanner;

public class scaner2 {
    public static void main(String[] args) {
        Scanner input =new Scanner((System.in));


        System.out.println("input first number");
        int firstnum = input.nextInt() ;

        System.out.println("Input second number");
         int secondnum = input.nextInt();

         int result =firstnum*secondnum;
        System.out.println("the result will be" + result);




    }
}
