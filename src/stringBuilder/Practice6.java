package stringBuilder;

import java.util.ArrayList;
import java.util.List;

public class Practice6 {
    public  static void main(String[] args) {
        //reverse()
        StringBuilder builder = new StringBuilder("Welcome");
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
        // toString()
        String str = builder.toString();
        System.out.println(str.toUpperCase());
        String[] words =  {"code", "fish", "mock", "interview",  "is", "coming", "soon"};
        reverseEveryWord(words);

    }
    static public List<String> reverseEveryWord(String[] array){
        List<String> list  = new ArrayList<>();
        for ( String str  : array   ){
            StringBuilder builder = new StringBuilder(str);
            list.add( builder.reverse() .toString() );
        }
        System.out.println( list);
        return list;
    }
}







