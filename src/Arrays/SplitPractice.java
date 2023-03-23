package Arrays;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {

        String str1="Selenium";

       String[] parts= str1.split("n");
        System.out.println(Arrays.toString(parts));
        // csv files

       // today is saturday


        String str2="It is a good day to practice Java.It is snowing outside.";
       str2=str2.replace(".","");
        //store every word in a array

        String[] words=str2.split(" ");
        System.out.println(Arrays.toString(words));


    }
}
