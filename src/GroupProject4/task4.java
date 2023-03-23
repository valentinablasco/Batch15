package GroupProject4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number btw1 to 10");
        int num = scanner.nextInt();


        for (int i = num;  i>0; i--) {
            for (int j = i; j>0; j--) {
                System.out.print(i);
            }
            System.out.println("");


        }
    }
}