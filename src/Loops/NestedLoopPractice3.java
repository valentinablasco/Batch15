package Loops;

import java.util.Scanner;

public class NestedLoopPractice3 {
    public static void main(String[] args) {
        /*
        print out folowing mesage 2020,2021,2022
        2020-->1,2,...12
        2021-->1.2.3...12
        2022--->1,2,3....12
         */
        for (int year = 2020; year <= 2022; year++) {
            System.out.print(year + "-->");

            for (int month = 1; month <= 12; month++) {
                System.out.print(month + ",");
            }
            System.out.println();
        }

        for (int year = 2020; year <= 2022; year++) {
            System.out.print(year + "-->");

            for (int month = 1; month <= 12; month++) {

                switch (month) {
                    case 1:System.out.print(month+"-Januarie");break;


                        case 2: System.out.print(month+"-Februarie");
                                break;
                            case 3:
                                System.out.print(month+"-March");
                                break;
                        }
                        System.out.println();
                }
            }

        }
    }
