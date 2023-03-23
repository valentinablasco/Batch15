package BogdanMenthoring;

public class Practice1 {
    public static void main(String[] args) {

        String s1="mama";
        String s2="amam";

        boolean flag=false;

        char[]a=s1.toCharArray();
        char[]b=s1.toCharArray();

        //Arrays.sort(a);
        //Arrays.sort(b);

        for (int i =0;i <a.length;i++){
            if (a[i]==b[i]){
                flag=true;
            }else {
                flag=false;
                break;
            }
        }
        if (flag){
            System.out.println("Positive result");
        }else {
            System.out.println(s2);

        }
    }
}
