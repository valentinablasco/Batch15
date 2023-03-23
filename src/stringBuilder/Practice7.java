package stringBuilder;

public class Practice7 {

    //StringBuilder sum  = new StringBuilder();

    /*

     */

    public static int sum(StringBuilder str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {

            sum += str.charAt(i);
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sum += Integer.parseInt("" + str.charAt(i));
            }
            }

            System.out.println(sum);

            return sum;
        }

        public static void main (String[]args){
            StringBuilder stringBuilder = new StringBuilder("ASDFHGNJK23R");

            sum(stringBuilder);
        }
    }
