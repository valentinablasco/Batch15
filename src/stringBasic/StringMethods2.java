package stringBasic;

public class StringMethods2 {

    public static void main(String[] args) {

        String str= "phone";
        System.out.println( str.charAt(4));
       // System.out.println( str.charAt(5););//StringIndexoutofBoundsException

       // System.out.println(str.charAt(-3));///StringIndexoutofBoundsException

      //  System.out.println(str.charAt(str.length() ));// e?StringIndexoutofBoundsException

        System.out.println(str.charAt(str.length() -2 ));//n

        //indexOf;

        System.out.println(str.indexOf('p'));//0
        System.out.println(str.indexOf("p"));//0
        System.out.println(str.indexOf("ph"));// 0-->if given chars will match with in the string
                                              //in the same order sequence,it will return
                                                  //first matching vhar's index number


        System.out.println(str.indexOf("ne"));//3
        str ="new York";
        //index number of space
        System.out.println(str.indexOf(' '));//3
        str="mama";
        System.out.println(str.indexOf('a' ));//1

        str="happy evening to you";
        System.out.println(str.indexOf('y'));//4

        //find index of second'y'
        // how to pass index 5 above by dinamically?
        int indexOfSecondY=str.indexOf( 'y', str.indexOf('y')+1);

        System.out.println(indexOfSecondY);//17

        String word ="Java is getting easy :)";
        //find the second space index number



        System.out.println( word.indexOf("easy:)"));//

        String text ="Do whatever it Takes ";
        System.out.println(text.toLowerCase());//
        System.out.println(text.toUpperCase());//
        String str2 = text.toUpperCase();
        System.out.println(text);//?o whatever it Takes

        text = text.concat(str2).toUpperCase();
        System.out.println(text);

        text += text.concat(str2).toUpperCase();
        System.out.println(text);







    }
}

