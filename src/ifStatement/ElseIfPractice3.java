package ifStatement;

import java.util.Scanner;

public class ElseIfPractice3 {
    public static void main(String[] args) {
        /* there are3 test for aclass
        -to get lletter score for averages
        -use the following scale
        90-100-->A
        80-90-->B
        70-80=C
        60-69-->D
         */



        int t1=100, t2=100,t3=100,average=0;

        average =(t1+t2+t3)/3;
        if (average>=90 &&average<=100){
            System.out.println("A");
        }else if (average>=80 &&average<90){
            System.out.println("B");
        }else  if (average>=70 && average<80){
            System.out.println("C");
        }else if (average>=60 && average<=69){
            System.out.println("D");
        }else {
            System.out.println("Please come again");
        }
    }
}
