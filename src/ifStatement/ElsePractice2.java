package ifStatement;

import com.sun.source.tree.IfTree;

import javax.xml.transform.stax.StAXResult;
import java.util.Scanner;

public class ElsePractice2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hou much is your spending");

        double amount =scanner.nextDouble();
        if (amount>=1000) {
            double discount1 = amount * 0.20;
            amount = amount - discount1;
            System.out.println("Your saving is:"+ amount);

            System.out.println("Your final payment after 20% discount is:" + amount);
        }else{
            double discount2=amount*0.05;

            System.out.println("Your final payment after 5% discount is:"+amount);

           double amaunt=scanner.nextDouble();
            System.out.println("what is your state");
            scanner.nextLine();
            String state=scanner.nextLine();
            double tax=0,txTax=0.045;
             if (state.equalsIgnoreCase("tx")||state.equalsIgnoreCase("texas")){
                 tax =amount* txTax;
             }else {
                 tax=amount*0.10;
                 if (amount >= 1000) {
                     double discount1 =amount*0.20;
                     amount=(amaunt-discount1)+tax;

                     System.out.println("Your saving is:"+amount);
                     System.out.println("Your final payment after 20% discount is:"+amount);
                 }else{

                     double discount = amount * 0.05;
                     amount=(amaunt-discount2)+tax;
                     System.out.println("Your saving is:"+discount2);
                     System.out.println("Your final payment after 5% discount is:"+ amount);
                 }
             }
        }

            }
        }































