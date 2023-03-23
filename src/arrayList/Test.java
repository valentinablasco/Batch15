package arrayList;

import  Object.BankAccount;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Computer> computers = new ArrayList<>();
        Computer c1 = new Computer("Apple", 1600, "White", 14.5);

        Computer c2 = new Computer("Samsung", 600, "black", 13.5);

        Computer c3 = new Computer("Sony", 745, "grey", 12.5);

        Computer c4 = new Computer("ASUS", 1000, "red", 15);
        computers.add(c1);
        computers.add(c2);
        computers.add(c3);
        computers.add(c4);
        System.out.println(computers);


        //find computers they less than 1000$, and show their brand,cost, and color

        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).price < 1000) {
                System.out.println(computers.get(i).brand + " - " + computers.get(i).price + " - " + computers.get(i).color);
            }
        }
        ArrayList<Computer>str=findFancyComputer(computers);
        System.out.println(str);
        System.out.println(totalCost(computers));
BankAccount account=new BankAccount();
account.withdraw(totalCost(computers));
    }


    //create a method that will get an arraylist as an parameter
    ///this method wil find out computers, that has price more than 1200
    //and screen size is more than 13.5
    //this method will store and return those computers as a new arraylist
    public static ArrayList<Computer> findFancyComputer(ArrayList <Computer> devices){

        ArrayList<Computer> fancyComputers = new ArrayList<>();
        for (Computer device : devices){
            if(device.price>1200 && device.screenSize > 13.5){
                fancyComputers.add(device);

                }
            }

        return  fancyComputers;
    }


    //find out and tell the total prices of computers
    //create a method to solve this

    public static Double totalCost(ArrayList<Computer> name1){
        double total=0;
        for(Computer item :name1){
            total+=item.price;
        }
        return total;


    }



}

