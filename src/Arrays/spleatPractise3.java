package Arrays;

import java.util.Arrays;

public class spleatPractise3 {
    public static void main(String[] args) {

        String str = "Sunday is daddy day";
        String[] parts1 = str.split("d");

        System.out.println(Arrays.toString(parts1));

        String[] parts2 = str.split("d", 3);
        System.out.println(Arrays.toString(parts2));

        //12-23-2022
       // 12/23/2023
        //12.23.2022
        String data1="12-23-2022";
        String[] arr1=data1.split("-");
        System.out.println(arr1);
        if (arr1[0].equals("12") && arr1[1].equals("23")){


        System.out.println("Happy birth day");
        }
        if (arr1[0].equals("12") && arr1[1].equals("23")){
            System.out.println("Happy birth day!-2");
        }
        String date2="12-23-23";
        String[]arr2=date2.split( "\\.");
        System.out.println(Arrays.toString(arr2));
}}