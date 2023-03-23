package oop.inheritance4;

public class Book {

    int pageCount;
    String title;
    String kind;

    public int getPageCount(){
        return 600;

    }
    public Book(int pageCount,String title,String kind){
        this.kind=kind;
        this.pageCount=pageCount;
        this.title=title;
    }

      public static void read(){
          System.out.println("Reading book");
      }



}
