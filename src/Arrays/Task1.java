package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //ask user haw many chocolate names she/he nwants store in array
        //get the name of the chocolates from user
        //and store them into an array
        //lindor,milka,twix,ferroro,snikers,m&m
        //if the name is has 5 or less letters store in to 'shortNames'array
        //other wise store into 'longNames'array


        System.out.println("How many chocolate names you want to store ?");
        Scanner scanner = new Scanner(System.in);
        int size=scanner.nextInt();
        scanner.nextLine();

        String[]names=new String[size];
        String[]shortN=new String[size];
        String[]longN=new String[size];



        for (int i=0;i<size; i++){
            System.out.println("Please enter name of chocolate"+(i+1));

            String str =scanner.nextLine();
            names[i]=str;

            if (str.length()>5 ){
                longN[i]=str;

            }else {
                shortN[i]=str;
            }
        }

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(longN));
        System.out.println(Arrays.toString(shortN));
    }





}
