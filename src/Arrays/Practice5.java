package Arrays;

public class Practice5 {
    public static void main(String[] args) {

        int [] ages = {21, 23, 27, 23, 27, 30, 35, 34, 18, 38, 19};
        //find the bigest age
        int largest = ages[0];
        for (int i = 0; i < ages.length; i++) {

            if (ages[i] >largest){
                largest=ages[i];

            }
            System.out.println(largest);








            }

        }
    }
