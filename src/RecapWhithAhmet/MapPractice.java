package RecapWhithAhmet;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    /*
    Posible interview  Questions:

    1-Can you tell me about map and why do you use map in your project?
    ->Map is awesome interface to be use in my project to share/store my data as"key"and "Value";

    2-What is the connection between Collection and Map?
    -->They are all useful that i use in my project for different purpose.
    As i mentioned before Set is all about uniqueness
                          List is all about dublication if it is needed
                          Map is all about KEY and Value

       SHOW OFF:dis you know that there is a good explanation for the connection that I realized
       When  i was working on Map,I cheched the feature of KEY and Feature of Value.

       -->Key acts like The Set Feature.it mean it only accepts the Unique Data
       -->Value acts like the List Feature.IT means it accepts dublicates as well
    3-What is the type of Map and difference between them?

    -->To be honest,I didn't like map at the beginning because it seemed so complicated but after i learned the beauty of sub-types wich are:

    -->HashMap-->it store randomly
    -->LInkedSet-->it store insertion
    -->TreeSet-->is my favorite to do ascending order.

    //Schnucks-->Tally Simbe Robot

    4-Synchronization?can you give example and what do you know about it usage in java?

    --> IN JAVA FIRST COME FIRST SERVE-->IN AUTOMATION -->WAIT TIME


  *->It executes any actions one by one (one after another)
  ***->We have two most common concepts in java use Synchronization -->HashTable-->Strinf  Buffer
  ***-->Synchronization system is *********************Thread-Safe********************and************SLOWER****************
  ***-->NON-SYNCHRONIZED SYSTEM  is*****NOT THREAD-SAFE*****FASTER****
  -->LIST,MAP,SET,STRING BUILDER
     */
    public  synchronized  void run(){
        System.out.println("hello");
    }
    public void run2(){
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        Map<String,String>names=new HashMap<>();
    }
    /*
    Home work:By Tomorrow
    String[]fruits ={"Apple","Banana","Peach","Apple","Orange","Strawberry","Banana","Apple","Cherry","Orange"};
TASK:I want you get the outpu of totall item for each:
-->Apple=3,Banana=2,Orange=2,Strawberry=1,Cherry=1
TIPS:You can use a method(map) containsKey
TIPS:If condition
     */
}
