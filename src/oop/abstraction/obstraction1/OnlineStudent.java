package oop.abstraction.obstraction1;

public class OnlineStudent extends Student {

    public OnlineStudent(String name,int Id){
        super("Tim",1234);
    }

    public void study(){
        System.out.println("Online Student studies");
    }


    public int test1() {
        System.out.println("Online Student Test");
        return 4;
    }
    public int watchViaZoom(){
        System.out.println("Attending via zoom");
        return 4;
    }
}
