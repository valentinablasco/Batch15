package Loops;

public class ReverseinString {
    public static void main(String[] args) {

        //check if given string is polidrome or nor
        //EFE,YAY,Tuesday,WoW,civic,level,anna,....


        String str = "EFE";//yadseuT
        String reversed = " ";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);

        }
        if (str.equals(reversed)) {
            System.out.println("It is Polindrome");
        } else {
            System.out.println("Not Palidrome");
        }
    }
}