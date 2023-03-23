package Arrays;

public class Practice6 {
    public static void main(String[] args) {

        char[] symbols = {'a','#','9','w','3','6','@'};

        //print out only numbers
        //count digits ,letters and other symbols
        //there are...2...letters
        //There are...5...digits
        ///there are...1..other symbols
int dig=0,let=0,oth=0;
        for (int index = 0; index < symbols.length; index++) {

            if (symbols[index] >= '0' && symbols[index] <= '9') {

                System.out.println(symbols[index]);
            } else if (symbols[index]>='a' && symbols[index]<='z' ||symbols[index] >='A' &&symbols[index]<='Z') {
                System.out.println("THESE are Letters:"+symbols[index]);

            }else {
                oth++;
                System.out.println("Others"+symbols[index]);
            }




                System.out.println("There are" + dig + " digits");
            System.out.println("There are" + let + " letters");
            System.out.println("There are" + oth+ " other symbol");
            }
        }
    }
