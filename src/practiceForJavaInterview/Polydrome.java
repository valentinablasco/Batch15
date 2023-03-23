package practiceForJavaInterview;

public class Polydrome {
    public static void main(String[] args) {
        String p1 = "civic";
        String p2="";
        for (int i = p1.length()-1; i>=0; i--){
            p2 +=p1.charAt(i);

        }
        if (p1.equals(p2)) {
            System.out.println("is palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }

}
