package practiceForJavaInterview;

public class JavaRegex1 {
    public static void main(String[] args) {
        String m = "fhshfjdjg45768476784&*$(()*&&*^&^%%^%";
        String a = "";
        for (int i = 0; i<m.length(); i++){
            if (Character.isAlphabetic(m.charAt(i))){
                a+=m.charAt(i);
            }

        }
        System.out.println(a.length());
    }
}

