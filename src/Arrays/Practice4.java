package Arrays;

import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {
        int[] numbers = {4, 3, 5, 6, 72, 6, 8, 45};

        System.out.println(numbers.length);//size
        System.out.println(numbers[0]);//
        System.out.println(Arrays.toString(numbers));

        numbers[1] = 88;//giving new value to index 1
        System.out.println(Arrays.toString(numbers));

        //numbers[7]=111;//ArrayIndexOutofBoundsException

        System.out.println("Good morning");

        //multiply each  element by 10 and print out the result
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] * 10);
        }
        //multiply numbers that are greather than 10 by 100 and print out the result

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 10) {
                System.out.println(numbers[i] * 100);
            }
        }
    }
}