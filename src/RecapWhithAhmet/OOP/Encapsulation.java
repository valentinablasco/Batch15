package RecapWhithAhmet.OOP;

public class Encapsulation {
    /*
    Possible Interview Questions:
    1-What is Encapsulations ?Why do you use it?
    -->Encapsulations is a way to protect /hide/restrict(limit) data from other users/classes.
    -->We use "Private"key word to make the data  encapsulated
    -->It is a way to make your data not accessible and manipulable by anyone
    ->It is a way of restriction the data from the user/classes
    -->It is away to limit the user to reach out the class  data
    -->It is way to hide the data from classes/users
    -->It is away yo protect your data from other classes/users

    2-How can you access the data from encapsulations?

    -->To be able to access these all data which are private ,we use getter  and setter


    3-If encapsulation is hiding the data from user /other classes and with "getter" and "setter" you can still  access it.What is the point of using encapsulations?
    -->Actually ,you can access the data from user/other classes and with getter and setter
    .But they cannot access your implementation inside of the method.It means you are still protecting your data based on your condition.If you want me give an example
    SIR/MADAM I can say i have  a book and this book has 300 pages (0-300)i would like to access the specific pages of book .Whenever i search for more than 300 or less than 0,
    this website should give me an error and say that the page is not found.It means I manipulate /break their codes.What people do that limit the user to access/hide/protect their data with
    a specific condition.

    Summary:I know you can still access the data with getters and setters but you cannot access inside of the code(implementation)which limits you.
     */
    public static void main(String[] args) {
        EncapsulationPractice encapsulationPractice=new EncapsulationPractice();
   encapsulationPractice.setCreditCard(555555);
        System.out.println(encapsulationPractice.getCreditCard());

    }



}
