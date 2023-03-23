package GroupProject4;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence with no space and with capital letter");
        String sentence = scanner.nextLine();
        int l = sentence.length();
        for (int i = 0; i < l; i++) {
            char c = sentence.charAt(i);

            if (Character.isUpperCase(c)) {
                System.out.print(" " + c);
            } else {
                System.out.print(c);

            }
        }


    }

}