package Object;

import java.util.Arrays;

public class TestVeggie {
    public static void main(String[] args) {
        String[] items={"green","red tomatoes","green tomatoes"};


        int count = MethodPractice3.veggiesFilter(items);
        System.out.println(count);


        MethodPractice3 object1= new MethodPractice3();
        object1.veggiesFilter(items);



      String[]product = MethodPractice3.veggieFilter(items,7);
        System.out.println(Arrays.toString(product));






    }
}
