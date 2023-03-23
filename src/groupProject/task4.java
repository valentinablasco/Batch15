package groupProject;

import java.time.Year;

public class task4 {
    public static void main(String[] args) {


        int dauInYear =360;
        int hourInYear=8760;
        int minInYear=525600;
        int hourInDay=24;
        int minInHour=60;

        int minute=3456789;

        int year= minute /minInYear;
        System.out.println(year);//6

         int year6min = year*minInYear;
         System.out.println(year6min);
          int remaider = minute%year6min;
int hours= remaider/minInHour;
System.out.println(hours);
int days=hours/hourInDay;
System.out.println(days);

}
}