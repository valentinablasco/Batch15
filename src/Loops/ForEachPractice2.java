package Loops;

import java.util.Arrays;
import java.util.Locale;

public class ForEachPractice2 {
    public static void main(String[] args) {
        String[] flowers = {"rose","daisy", "sunflower"};
            for (String flower : flowers) {

                System.out.println(flower.toUpperCase());
            }
            String[]cities={"Chicago","Miami","New York","Tokyo","Doha","Denver"};
            String[]cityEmails=new String[cities.length];
            int i=0;
            for (String city:cities) {
                cityEmails[i] = city.toLowerCase().replace("", "").concat("@gmail.com");
                i++;
            }
                System.out.println(Arrays.toString(cityEmails));

            }


            //chicago@gmail.com miami@gmail.com
           //put those email addres in another storage for future reference


        }

