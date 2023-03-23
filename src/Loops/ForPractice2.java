package Loops;

public class ForPractice2 {

    public static void main(String[] args) {
        //find the sum of number between 10 and 15 by using for loop

        int sum = 0;
        for (int a = 10; a <= 15; a++) {

            sum = sum + a;
        }
        System.out.println("sum" + sum);

        String str = "Today is beautiful";
        //print out every letter from this given string separated bby comma

        //T,o,d,...

        for (int i = 0; i < str.length(); i++) {
            //System.out.print(  str.charAt(i)+",");

            if (i == str.length() - 1) {
                System.out.print(str.charAt(i));

            } else {
                System.out.print(str.charAt(i) + ",");

            }
        }
    }
}

                //print above style without spaces-->get rid of spaces an print letter with dash
                //str = "Today is beautiful";
                //str = str.replace(" ", "");

                //for (int i = 0; i < str.length(); i++) {
                  //  System.out.print(str.charAt(i) + "");
                   // if (i == str.length() - 1&& str.charAt(i)!= '') {
                        //System.out.print(str.charAt(i));
                    //} else {
                       // System.out.print(str.charAt(i) + "-");










