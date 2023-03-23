package BogdanMenthoring;

import java.util.Map;

public class Practice4 {
    public static void main(String[] args) {
        int n= 3456;
        int s = 0;
        int res = 0;
      for (int i = 0; i >=0; i++){
          if (n >=0){
              s = n%10;
              res += s;
              n=n/10;
          }else break;
      }
        System.out.println(res);
    }
}
