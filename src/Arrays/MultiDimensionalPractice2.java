package Arrays;

public class MultiDimensionalPractice2 {
    public static void main(String[] args) {
        String[][] citiesFromStates={{"Los Angeles","Sacramento"},{"Chicago","Springfield","Des Plains"},{"Baltimore","Rockville"}};

        //use for each loops to show names of cities
      //  print -->when you find chicago-->"chicago is in IL"

        for (String[]city:citiesFromStates){
            for (String cities:city){



                if (cities.equalsIgnoreCase("chicaGo")){
                    System.out.println(cities+"is in IL");
                   // break LABEL;
                }else System.out.println(cities);





            }
        }
    }
}
