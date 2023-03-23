package stringBasic;

import groupProject2.Scaner;

import java.util.Scanner;

public class StringMethod3 {

    public static void main(String[] args) {

        String str ="water";
        boolean result1= str.startsWith("w");
        System.out.println(result1);//true
        System.out.println(str.startsWith("water"));//true
        System.out.println(str.startsWith("ter"));//fals
        System.out.println(str.endsWith("r"));//true
        System.out.println(str.endsWith("abc"));//false

        /*TASK: get a string from User via scanner and:
-print:
	- first char
	- last char
	- index of second matching letter 'c'
	- lenght of string
	- index of x
	- middle char

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a String value");

      String userInput=  scanner.nextLine();
        System.out.println( userInput.charAt(0)); //first char
        System.out.println(userInput.charAt( userInput.length()-1));//last char







    }
}
