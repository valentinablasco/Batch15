package BogdanMenthoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c {

    public static boolean method(int[] arr) {
        List<Integer> res1 = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                res1.add(arr[i]);
            }
        }
        if (res1.size() <= 4)
            return false;

        return true;
    }




    public static void main(String[] args) {
    int[] digits={15,30,45,65,31,43,21,98,90,60};


    //and if size of result array less than 4 return false;

}

}
