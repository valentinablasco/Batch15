package oop.abstraction.obstraction1;

public  class CampusStudent extends Student {

    public CampusStudent(String name,int id){
        super(name,id);;
    }

    public void study(){
        System.out.println("Study in Campus");

    }
    //Non-abstract class canNot have abstract method
    //public abstract void drink();
    public void sleep (){
        System.out.println("Campus students sleeping for 5 hr");

    }
    public int test1(){
        System.out.println("Campus student staking test");
        return 3;
    }

    public void playTableTennis(){
        System.out.println("Table Tennis");
    }
}