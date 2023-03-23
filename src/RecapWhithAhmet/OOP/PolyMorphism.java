package RecapWhithAhmet.OOP;

public class PolyMorphism {
    /*
   1- What is polymorphism?(poly-->many,morphism-->forms)

   -->it is a different form of object
   2-What is dynamic and static polymorphism?

   *Dynamic Polymorphism :is all about Everriding.-->Dynamic(action)
   *Static Polymorphism :is all about Overloading.(Static(stable)-->no action)


   3-What is the diference between Ovveriding and Overloading

   Overloading:
   1-Overloading needs to be in same class
   2-Overloading methods can have final,static,private
   *3-Whenever  you overload,it checks Methods Signature (Different method signature)
     Method signature==>Name of the method +Parameter
     -->public void run(int speed)
     --private void run(int speed,String name)



   OVVERIDING:
   1-
   2-you can not overload,final,static,privat methods
   3-Whenever you  override,it check npt only Method signature also return
   It must have Same Method Signature


     */

    public void dismiss(int time,int minute,String nameOfTeacher){
        System.out.println("Student are living at" +time+minute+"with teacher"+ nameOfTeacher);
    }
    public  void  dismiss(int hour,String nameOfTeacher){
        System.out.println("Student are leaving at"+hour+"whith Teacher"+nameOfTeacher);
    }
    public void dismiss(String data,int nameOfTeacher){
        System.out.println("Hello");

    }
}
