package GroupProject3;

public class task1 {
    public static void main(String[] args) {
        //Please use method chaining for the following Strings.
      //Methods arprovided next to the String.
  // S tring “ Snicker “; —> trim, toUpperCase, substring and
  //charAt methods
//String “Cookie” —> toLowerCase, replace ‘o’ with ‘u’,
///concat with ’s’,
///starts with ‘C’
//Descripti
         String name1="   Snicker  ";
       char result1=  name1.trim().toUpperCase().substring(2,4).charAt(1);
        System.out.println(result1);

        String name2="  Cookie ";
      Boolean result2=name2.trim().toLowerCase().replace("o","u").concat("S").startsWith("C");

        System.out.println(result2);




    }
}
