package Arrays;

import Primitive.Casting;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ObjectArrayPractice {
    public static void main(String[] args) {
        String str = new String("Test");
        int number = 9;
        boolean bl1 = true;
        double d1 = 9.8;
        Scanner scanner = new Scanner(System.in);

        Object[] exemple = {str, number, bl1, d1, scanner};
        for (Object ex : exemple) {

            System.out.println(ex.toString().charAt(0));



        }
    }
}