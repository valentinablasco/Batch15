package BogdanMenthoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework2 {

        /*
        int [] arr1 = {1,2,7,8,1,5,4};
int a = 9;
if sum of two element’s equal “a”
save first of this numbers to new array
and return it
         */
        public static void main(String[] args) {


        int[] arr1 = {1, 2, 7, 8, 1, 5, 4};
        int a = 9;
        String str = "";
        //int[]arr2=new int[str.length()];
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] + arr1[i + 1] == a) {
                str += arr1[i];
            }

            }
            int[] arr2 = new int[str.length()];

            for (int k = 0; k < str.length(); k++) {
             arr2[k]=Integer.parseInt("" + str.charAt(k));


            }
            System.out.println(Arrays.toString(arr2));



        }

    }
