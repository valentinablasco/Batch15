public class Method {
    public static String method(String str) {


        String result = "";
        for (int i = str.length() - 1; i >= 0; i++) {

            result += str.charAt(i);
        }
        return str;
    }


    public static void main(String[] args) {
        String w="Hello";
        System.out.println();

    }
}