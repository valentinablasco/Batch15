package practiceForJavaInterview;

public class Findalphabet {
    public static void main(String[] args) {

        String give="ZCVNdwasedtrfhy657890-6521";
        String replaced=give.replaceAll("[^A-Za-z]","");
        System.out.println(replaced.length());


    }
}
