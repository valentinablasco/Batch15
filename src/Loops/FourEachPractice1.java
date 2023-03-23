package Loops;

public class FourEachPractice1 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 6, 7, 8, 9, 10};

        //by using for-each loop print elements

        for (int num : numbers) {

            System.out.println(num);

            System.out.println(num+10);
        }
        String[]items={"Cup","bottle","Microphone"};
        for (String str : items){

            if (str.equalsIgnoreCase("Cup")){
                System.out.println(str);
            }

        }
    }
}