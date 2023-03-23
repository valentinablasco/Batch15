package Primitive;

public class Task {

    public static void main(String[] args) {
        int test1=6,test2=100,test3=80,average,requiredAverageScore=60,requiredAttendance=90,myAttendance=100;
        average=(test1+test2+test3)/3;
      boolean result=  average >= requiredAverageScore && myAttendance >=requiredAttendance;

      System.out.println(result);



    }
}
