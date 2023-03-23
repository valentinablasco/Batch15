package Loops;

public class NestedLoopPractice2 {

    public static void main(String[] args) {

        /*
        print out hours and minutes as follow

        for the hours from 1 to 12
        minutes from 0 to 59

        hour- 1:min-0
        hour -1:min-1
        hour -1:min-2
        ---------
        hour-2 :min-0
        hour-2 :min-1
         */

///nake sure each hour is 30 minutes
        Outer:
        for (int hour = 1; hour < 12; hour++) {

            INNER:
            for (int min = 0; min < 60; min++) {
                if (min == 30) {
                    //break Outer;
                }
                INNER2:
                for (int sec = 0; sec < 60; sec++) {
                    if (sec > 20 && sec < 40) {
                        continue Outer;
                    }
                    if (hour <= 6) {
                        System.out.println("hour-" + hour + ":min-" + min + ":sec-" + sec + "AM");

                    } else {
                        System.out.println("hour-" + hour + ":min-" + min + ":sec-" + sec + "PM");
                    }
                }
            }
            break;
        }
    }
}















