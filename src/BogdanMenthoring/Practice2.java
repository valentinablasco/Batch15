package BogdanMenthoring;

public class Practice2 {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(arr));
        String str = "Hi peoples here";
        String[] arr = str.split(" ");




        for (String name : arr) {
            String reverse = "";
            for (int i = 0; i <name.length(); i++) {
                reverse += name.charAt(name.length() - i - 1);
            }
            System.out.print(reverse + " ");


        }
    }
}