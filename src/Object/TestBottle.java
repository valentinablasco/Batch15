package Object;

public class TestBottle {
    public static void main(String[] args) {
        Bottle b1 = new Bottle(8);
        System.out.println(b1.liquidAmount);

        b1.usage(4);
        System.out.println(b1.liquidAmount);

        //create a method that will take bottle object as a parameter
        //this method will gound out if the bottles size is greater than 8 oz or not
        //if is greater than 8,should print "it is a LARGE BOTTLE"
     sizeChecker(b1);
     Bottle b2= new Bottle(16);//hashcode -->location of the object
     sizeChecker(b2);
        System.out.println(b2);//hashcode -->location of the object
        System.out.println(b2);

    }

    public static void sizeChecker(Bottle bottle) {
        if (bottle.size > 8) {
            System.out.println("It is a Large bottle");
        } else {
            System.out.println("It is a SMALL bottle");
        }

    }
}
