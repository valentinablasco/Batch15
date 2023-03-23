package practiceForJavaInterview;

import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Provide number of rows to print");
        int row = scanner.nextInt();


// int row = 10;
        for (int i = 1; i <= row; i++) {
            for (int k = 1; k <= row - i; k++) {
                System.out.println(" ");
            }
            for (int a = 1; a <= i; a++) {
                System.out.print(" * ");

            }
        }
    }
}