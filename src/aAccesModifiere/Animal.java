package aAccesModifiere;

public class Animal {

   public String namePublic;
   protected int ageProtected;
   String colorDefault;
   private double weightPrivate;

    public void  eatPublic() {
        System.out.println("Eat" + weightPrivate);
    }


     protected void  runProtected(){
        System.out.println("run");
    }

  private   void sleepPrivate(){
        System.out.println("Sleep" +weightPrivate);
    }

    void  jump(){
        System.out.println("Jump");
    }



}
