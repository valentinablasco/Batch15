package Loops;

public class ForPractice4 {
    public static void main(String[] args) {
        String str = "It is a clody day in Chicago";

        //print out >>"I found a lowercase'c'
        //when you see a lowercase'c
        //count how many 'c'in the string?


        for (int i = 0, counter = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'c') {
                counter++;
                System.out.println("I found a lowercase 'c'");
            }
            if (i == str.length() - 1) {
                System.out.println("I found" + counter + "'c' in the string");
                //  }
                //}
                //print out letters i's from the string

                //if (str.charAt(i)=='i'){
                //  System.out.println(str.charAt(i));
            }
        }
    }
}


