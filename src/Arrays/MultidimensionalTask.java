package Arrays;

public class MultidimensionalTask {

    public static void main(String[] args) {
        /*
        -Computers--
Apple -> 2500
Dell  --> 1800
Acer  --> 1399
Samsung -> 1550.99
--TV--
LG     --> 1100
Sony   --> 800
Toshiba --> 599
--Speakers--
google   --> 99.99
Bose     --> 120.99
JBL     --> 89.95
         */
        // show me google product whici are less than $100
        String[][] brands = {{"Apple", "Dell","google","Accer","Samsung"}, {"LG", "Sony", "Toshiba"}, {"Google", "Bose", "JBL"}};
        double[][] prices = {{2500, 1800,400, 1399, 1550.99}, {1100, 800, 599}, {99.99, 120.99, 89.95}};

        for (int i= 0; i < brands.length; i++) {
            for (int j = 0; j < brands[i].length; j++) {
                //System.out.println(brands[i][j] + " is $ " + prices[i][j]);

                if (brands[i][j].equalsIgnoreCase("google")&&prices[i][j]<100) {
                    System.out.println(brands[i][j]+"is the item from google with price of $"+prices[i][j]);

                }
            }

        }
    }
}