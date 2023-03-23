package RecapWhithAhmet;

public class GarbageCollector {

    /*
    Possible interview questions:

    1-Wat is garbage collector and were is it coming from?

    Garbage Collector =>It is a way to clean up useless/unused data from the memory.Otherwise ,it will takes up some space in your memory and will cause low memory error.
    Primitive-->stock Object->Heap
    System.gc()==>It is coming from System class

    2-How can you prove  that GC  is working?
    To be able to prove that GC is working I ovveride finalize method from Object Class.(Object class is the parent of every class)

    3- How can you make the element garbage?

    -->You can assign value -->null
    --> you can assign the reference with another value

    int a=5;
    int b=3;
    b=a

    4-Do you have to call Gc to clean up your codes
    No,you do not have to call GC since it is working automatically

     */

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        System.gc();

    }
}
