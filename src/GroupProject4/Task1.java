package GroupProject4;

public class Task1 {
    public static void main(String[] args) {
        String str = " Dream Job!";

        String reverse = "";
        for (int i = str.trim().length() ; i > 0; i--) {

            reverse +=str.charAt(i);



        }
        System.out.println(reverse);


    }
}

