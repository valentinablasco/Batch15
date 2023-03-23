package SwitchPractice;

import java.util.Scanner;

public class nestedswitchPractice {
    public static void main(String[] args) {

        /*
        1 -IT departmenr
        -John
        -Marry
        2-Accounting
        -jake
        3 Hr
        -Anna
        -Diana
        -mike
        4-Help desck
        -EFE



         */

        System.out.println("Please choose from the " + "following departments by presing related number:\n1 -IT\n2-Acounting\n3-HR\n4-Help Desk");
        Scanner scanner=new Scanner(System.in);
       int department=scanner.nextInt();
        switch (department){

            case 1:
                System.out.println("You reached out IT department.Who do you want to speak with ?John/Marry");
                scanner.nextLine();
            String name=    scanner.nextLine();
            name=name.toLowerCase();
            switch (name){


                case "John":
                    System.out.println("You are speaking with "+ name);break;
                case"Marry":
                    System.out.println("You are speaking with"+name);break;
                default:
                    System.out.println("There is no such a prerson like"+name);
            }
            case 2:
                System.out.println("You reached out to accounting department.Who do you want to speak with ?Bill/Jake");
                scanner.nextLine();
                String name1=scanner.nextLine();
                name1=name1.toLowerCase();
                switch (name1) {
                    case "bill":
                        System.out.println("You are speaking with " + name1);
                        break;
                    case "Jake":
                        System.out.println("You are speaking with " + name1);
                        break;
                    default:
                        System.out.println("There is no such a prerson like"+name1);
                }
            case 3 :System.out.println("You reached out to accounting department.Who do you want to speak with ?Anna/Diana/Mike");
                    scanner.nextLine();
                    String name2=scanner.nextLine();
                    name2=name2.toLowerCase();
                    switch (name2){
                        case"Diana":System.out.println("You are speaking with " + name2);
                        case"mike":System.out.println("You are speaking with " + name2);
                        case"Anna":System.out.println("You are speaking with " + name2);

                    }
            case 4:
                System.out.println("You reached out to help desck.You are speacking with Efe");break;
            default:
                System.out.println("There is no matching department for your entry");break;




                }

        }

    }

