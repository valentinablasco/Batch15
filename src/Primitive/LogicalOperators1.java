package Primitive;

public class LogicalOperators1 {

    public static void main(String[] args) {


        //travel--> pasport,ticket;
        boolean passport =true;
        boolean ticket =true;
        boolean travel =passport&&ticket;
        System.out.println("Can travel?"+travel);



        // party--> dressCode and age
        // age

        boolean dressCode = true;
        boolean age =true;
        boolean  CanAttendParty;

        CanAttendParty= dressCode &&age;
        System.out.println("Can attend party?"+ CanAttendParty);

        ///there is an event for kids,they allow if the age of child is between 12 and 16


        int childAge= 15;
        int lowerLimit=12,upperLimit=16;
      //  childAge>lowerLimit;
        //childAge<upperLimit
        boolean happyToPlay= childAge>lowerLimit &&childAge< upperLimit;

        System.out.println(happyToPlay);

        // parent want to come togheter for a family dinner,//
        // but kids who are age of 12 to 18 do not want to go with them
        // adults and younger kids are together
        // you have 5 years old child with

        int age1=5;
        int limit1=12,limit2 = 18;
        boolean withAdult = age1 <=limit1 || age1>=limit2;
        System.out.println("whith Adult"+ withAdult);


        // ||or
        // cash or card

        boolean cash=false, card=true,buy;
        buy=cash || card;
        System.out.println("Buy"+ buy);

        // travel >> a type ID(pasport?government ID),visa,ticket,need to have cash

        boolean passport1=true, govID=true,visa1=true,ticket1=ticket;
        double myMoney=1000,moneyLimit=5000;
      //  boolean result1 =passport1 || govID;
       // boolean resultMoney =myMoney>moneyLimit;

       //
        // boolean result2 =result1 && ticket1 &&myMoney;

        boolean fly = (passport1 || govID) && visa1 && ticket1 &&(myMoney>moneyLimit);
        System.out.println(fly);


        System.out.println(true || false && false);//true
        System.out.println(true &&false || false);//false













    }
}
