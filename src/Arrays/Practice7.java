package Arrays;

import java.util.Arrays;

public class Practice7 {
    public static void main(String[] args) {

        String[] brand = {"Nike", "Adidas", "Puma", "New Balance", "Reebook"};

        //print every brand name in reverse version
        //ekin,
        String[] reversedArray=new String[brand.length];
        for (int i = 0; i < brand.length; i++) {

            System.out.println(brand[i]);// String str ="Nike"
            String reversed="";

            for (int k = brand[i].length() - 1; k >= 0; k--) {
                reversed +=brand[i].charAt(k);


            }
            reversedArray[i]=reversed;
            System.out.println("Reversed of:"+ brand[i]+">>"+reversed);

        }
        System.out.println(Arrays.toString(reversedArray));
    }
}