package RecapWhithAhmet;

public class StringBuilderPractice {
    /*
    Possible interview questions:
    1-What is the difference between String and StringBuilder?

    They are both useful for my projecr in terms MUtability and Immutability
    -->String is immutable
   --> String Builder is Mutable
    -->StringBuilder has some different methods-->append ,reverse

    2-What is the difference between String Builder and String Buffer?

    -->String Buffer and HashTable are both synchronized
    -->Map,List,Set,String,StringBuilder are not synchronized


    Note: Mutable is all about the giving function/action/manipulation without  "RE-Assigning" the value

    Note2:Immutable is all about the giving function/action/manipulation with :RE-Assigning" the value
    Note3:PassByValue and PassByReference is all about the way that you pass the data
    -->if you call the method and pass the value directly/initialiazing
    (StringBUilderrecap.run("AHMET))-->it means you are passing the value->PASSBYVALUE

    -->if you call the method and pass the value with a reference
    String name="Ahmet";
    STRINGBUILDERRECAP.run(name);-->PassByReference
     */

    public static void main(String[] args) {
        //INMutability:
        String name="Ahmet";
      name=  name.replace("m","*").concat("Loves").concat("Java").trim();
        System.out.println(name);
        //mUTABILITY
        StringBuilder builder=new StringBuilder("Ahmet");
        builder.replace(2,3,"*").append("Loves").append("Java").trimToSize();
        System.out.println(builder);
        System.out.println(builder.reverse());
    }
}
