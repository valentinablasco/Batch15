package Primitive;

public class ComparisonOperators2 {

    public static void main(String[] args) {


        // there is on event,person is 18 years old or older,she can attend the event
        int ageOfPerson=20;
        int requiredAge=18;

       boolean canAttend=  ageOfPerson>=requiredAge;

               System.out.println(canAttend);//true


        boolean canAttend1= requiredAge<=ageOfPerson;
        System.out.println(canAttend);

        ///kids ,if the age of child is 12 or less,that can go to the event
         int kidAge =15, requiredKidAge=12;

         boolean kidCanGo= kidAge<=requiredKidAge;
         System.out.println("can the kid attend" + kidCanGo);

         //if the age of child is 10,they can not participate

        int childAge=10, requiredChildAge=10;

        boolean canChildNotAttend = childAge == requiredChildAge;
        System.out.println("This child cannot attend when the age is 10>>"+ canChildNotAttend);
        System.out.println(childAge != requiredChildAge);







    }
}
