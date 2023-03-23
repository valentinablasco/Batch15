package GroupProject3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your three ingredients whith spaces");
        String ing = input.nextLine();
        System.out.println("Please enter your number");
        int number=input.nextInt();



        int space1 = ing.indexOf(" "); //INDEX OF FIRST SPACE
        int space2 = ing.indexOf(" ", space1 +1);

        String convertNumber1 = "" + number;
        String replace1 = convertNumber1 + ing.substring(1,space1);

        number++;
        String convertNumber2 = "" + number;
        String replace2 = convertNumber2 + ing.substring(space1+2,space2);

        number++;
        String convertNumber3 = "" + number;
        String replace3 = convertNumber3 + ing.substring(space2+2, ing.length());

        System.out.println(replace1 + " " + replace2 + "" + " " + replace3);








    }
}
