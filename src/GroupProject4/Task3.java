package GroupProject4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number btw1 to 10");
        int num = scanner.nextInt();


        for (int i = 1; i <= num; i++) {
            for ( int j = 1; j <= i; j++)
                System.out.print(i);
                System.out.println("");

            }


        }
    }



