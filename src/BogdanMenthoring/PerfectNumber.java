package BogdanMenthoring;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) ;
            num += i;
        }

}
}
