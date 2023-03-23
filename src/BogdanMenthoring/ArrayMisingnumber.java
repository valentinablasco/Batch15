package BogdanMenthoring;

import java.util.Arrays;

public class ArrayMisingnumber {
    public static void main(String[] args) {

        int[] arr = {1,4,3,5,2};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != i) {
                System.out.println(i);
                break;

            }

        }
    }
}







































