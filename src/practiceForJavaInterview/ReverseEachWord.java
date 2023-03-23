package practiceForJavaInterview;

public class ReverseEachWord {

    public static void main(String[] args) {
        String str = "I love java";
        String [] spl = str.split(" ");
        String reverse = "";

        //System.out.println(Arrays.toString(str1));

        for (int i = spl.length - 1; i >= 0; i--) {
            reverse += spl[i] + " ";
        }

        System.out.println(reverse);
    }
}
