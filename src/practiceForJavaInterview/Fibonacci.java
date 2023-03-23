package practiceForJavaInterview;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

        public static void main(String[] args) {
            int q = 0, w = 1, e;
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i<10; i++){
                list.add(q);// adding first element in our list
                e= q + w; //reassign our values
                q=w;
                w=e;
            }
            System.out.println(list);
        }
    }


