package InterviewTask;

import java.util.Scanner;

public class StarTree {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide number of rows to print");
        int row = scanner.nextInt();


       // int row = 10;
        for (int i = 1; i <= row; i++) {
            for (int k = 1; k <= row - i; k++) {
            }
            for (int a = 1; a <= i; a++) {
                System.out.print("*");

            }
            System.out.println("");
        }

    }

}