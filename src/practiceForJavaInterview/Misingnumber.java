package practiceForJavaInterview;

import java.util.Arrays;

public class Misingnumber {
    public static void main(String[] args) {

        int[] arr={0,4,2,3,6,8,1,9,7};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        for (int i=0;i<arr.length;i++){
            if (arr[i] !=i){
                System.out.println(i);
                break;
            }
        }

    }
}
