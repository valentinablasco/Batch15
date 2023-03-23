package practiceForJavaInterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDublicates {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("mama", "tato", "baba", "tato", "dido", "mama");
        HashSet<String> set = new HashSet<>();
        for (String sm:data){
            set.add(sm);

        }
        System.out.println(set);
    }
}



