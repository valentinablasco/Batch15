package oop.Inheritance2;

public class Rose extends Flower {
   String color;
    public Rose(){

        super("RED");
    }
public Rose(String color,String size,double price){

    super(color,size,price);
    this.color=color;
}
  @Override
    public Integer run(int miles){

      System.out.println("Rose is happy to RUN");
      return miles+1;
  }




}
