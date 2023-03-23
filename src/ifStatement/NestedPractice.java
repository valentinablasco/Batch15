package ifStatement;

public class NestedPractice {
    public static void main(String[] args) {

        //id
        // visa
        //tickey
        //checid
        //check visa
        //chech ticket
        boolean id = true, visa =true, ticket = true;
        System.out.println("Checking id now...");
        if (id) {
            System.out.println("Cheching visa now...");

            if (visa) {
                System.out.println("Cheching ticket now..");

                if (ticket) {
                    System.out.println("Enjoy your fligh");


                } else {

                    System.out.println("First, you should have  ticket");

                }
            } else {
                System.out.println("You should have visa");
            }
        }else{
            System.out.println("You should have valid id");
        }
    }
}