package Turnary;

public class Practice2 {
    public static void main(String[] args) {



        String str="Techtorial";

        String str1=new String("Techtorial");

      String result1=  'a'=='a'? str.concat("Academy"):str.replace("tech","TECH");

        System.out.println(result1);
        System.out.println(  'a' == 'a'? str.concat("Academy"):str.replace("Tech","TECH"));
        System.out.println(  'a'>'a'? str.concat("Academy"):str.replace("tech","TECH"));


    }
}
