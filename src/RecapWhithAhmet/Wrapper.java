package RecapWhithAhmet;

import java.util.ArrayList;
import java.util.List;

public class Wrapper {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-What is Wrapper class ?

      -->Wrapper Class->It is a process to convert data into
      different forms.


    2-How many ways of wrapper classes do you know ?
    Note:Avoid using numbers for any options. Like There are 2 ways of
    doing conversion. Or there are 8 type of primitive data
      -->AutoBoxing
        -->Conversion data from Primitive to OBJECT

      -->UnBoxing
        -->Conversion data from OBJECT TO PRIMITIVE
    NOTE:The reason we use wrapper class to make a conversion data
    into format that we need.(Parsing,Object...etc)

     */
    public static void main(String[] args) {

        int number = 10;//primitive
        // number.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(number);
        System.out.println(numbers.get(0).hashCode());
        // numbers.get(0).//AUTOBOXING -->AUTOMATICALLY IT HAPPENS
        //In here I just added primitive into List and it turned
        //by itself object.

        //UNBOXING: Conversion from Object to primitive

        String str = "1235";//OBJECT
        int exampleNumber = Integer.parseInt(str); //example-->primitive
        System.out.println(exampleNumber);
    }
}