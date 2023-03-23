package practiceForJavaInterview;

public class PrimeNum {

        public static void main(String[] args) {
            int num =17;
            boolean flag = true;

            for (int i = 2; i< num/2; i++){
                if (num%i == 0){
                    flag= false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Prime");
            }else
                System.out.println("Not Prime");
        }
    }

