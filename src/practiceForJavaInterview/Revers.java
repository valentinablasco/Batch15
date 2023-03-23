package practiceForJavaInterview;

public class Revers {
    public static void main(String[] args) {

        String str= "Hello CodeFish";
        String [] arr=str.split(" ");

        for (String name:arr){
            String reverse="";
            for (int i=0;i<name.length();i++){
                reverse += name.charAt(name.length()-i-1);

            }
            System.out.print(reverse + " ");
        }
    }
    }



