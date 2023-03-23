package RecapWhithAhmet.OOP;

public class Exceptions {

    /*
    1-How do you handel exception?

    -->We can handle the exception with try and catch,trows
    2-Can you use more than catch block?How obout try block?
    -->You can use more than 1 catch block but only one try block
    3-What do you now about final,finalize,finally?
    FINAL--> Is a keyword to make the variable or methods,class unchangable
    (last version).
    Finalize:Is a method to clean up the unused/unless data(Garbage Collector) for proof we override the  finalize method.
    Finally:Ia a block that comes ofter try and catch block to do final execution no matter what


    4-What is difference between throw and Throws

    Both Throw and Throws are the concept of exception handling in which
    throws i used to explicity(out of block)throw the exception from a methods

    -->public void exception()throws NumberFormatException

    -->public void exception2() {
    new Throw NumberFormatExceptional(e);

    **While Throws are used next to method signature(Outside of Block)
    **Throw is used inside of the block
    */

    public static void main(String[] args) throws InterruptedException {
        String numbers = "$199";
        try {
            System.out.println(numbers);
            int price = Integer.parseInt(numbers);
            System.out.println(price);

        }catch(NumberFormatException ex){
            System.out.println("Your price parsing is not working");
            throw  new NumberFormatException();
    }finally {
            System.out.println("I am finally block");
        }
        Thread.sleep(3000);
        }

}
