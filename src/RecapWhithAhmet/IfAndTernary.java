package RecapWhithAhmet;

import java.util.Scanner;

public class IfAndTernary {

    /*
    Posible interview Questions:
    1-Most of the tehnical questions are required if conditions

    if is a conditional statement

    if(condition)                             if(condition){
    implementation                             else if(condition)
    else{                                       else{
    Implementation

    and(&&)                                        OR(//)

    True && TRUE-->TRUE                             TRUE || tRUE--> tRUE
    FALSE & FALSE-->FALSE                           FALSE || FALSE-->fALSE
    TRUE & FALSE-->FALSE                             tRUE || FALSE-->TRUE



     */
    /*
    -10-0-->super cold
    0-25--> it is normal
    25-50--> it is hot
     */
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int actualTemperature=scanner.nextInt();
       if (actualTemperature<0 && actualTemperature>-10){
           System.out.println("It is super cold");
       }else  if (actualTemperature<25 && actualTemperature>0){
            System.out.println("It is normal");;

        }else if (actualTemperature<50 && actualTemperature>25){
            System.out.println(" it is hot");
        }else {
           System.out.println("The input is not applied for the conditions please check");
       }
       boolean result=actualTemperature>10 || actualTemperature<5;
        System.out.println(result);



        // Ternary operators:Condition ? value1:value2;//condition true==> value1 False==? value2

        String name="Ahmet";
        String name2="ahmet";
        String result2=name.equalsIgnoreCase(name2)? "The values are matching": "The Values are not Matching";
        if (name.equalsIgnoreCase(name2)){
            System.out.println("The values are matching");
        }else {
            System.out.println("The Values are not Matching");
        }
        System.out.println(result2);
    }
}
