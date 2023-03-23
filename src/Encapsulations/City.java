package Encapsulations;

public class City {

   private long populations;
   private String name;
   private boolean isCapital;
   private int zipCode;

   public void  setPupulations(long pupulations1){
       populations=pupulations1;
   }
   public long getPupulations(){
       return populations;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}


