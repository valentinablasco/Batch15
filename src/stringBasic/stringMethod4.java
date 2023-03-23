package stringBasic;

public class stringMethod4 {

    public static void main(String[] args) {

        String season = "winter";

        //substring(); --->return string

        String part= season.substring( 1);
        System.out.println(part);

        String part2= season.substring(1, 4);
        System.out.println(part2);
        //System.out.println(season.substring( 9));//StringIndexOutofBoundException

        String task= "Welcome to Chicago";
        //take and print out the word "do" only from above string
        System.out.println(task.substring(5, 7));
       int firstSpaceIndex = task.indexOf(' ');

      int secondSpaceIndex= task.indexOf( ' ',firstSpaceIndex + 1);

      String secondWordFromSentence= task.substring(firstSpaceIndex + 1, secondSpaceIndex);
      System.out.println(secondWordFromSentence);




    }
}
