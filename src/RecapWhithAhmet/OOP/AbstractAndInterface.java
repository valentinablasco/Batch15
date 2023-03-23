package RecapWhithAhmet.OOP;

public class AbstractAndInterface {}

    /*
    Posible interview Questions:
    1-What is abstract ? and can you clarify it with little bit details?

    -->Abstract is a way to organize yhe method with only NECESSAry information(template) you have do not bady
    for abstract methods.It means people can see the template of the method and "Override" this based on theier requiremenr

    NOTE:wE do not have a body for abstract methods because every class extends to the abstract clas scan Make THEIR
    OWN IMPLEMENTATION.

    2-What do you need to have abstract class in your project?

   *For many methods you need developer to make their own implementation to reduce amount of duplication in the project which cause memory slowness
   system slowness,more execution for system.

    3-Where do you use abstract  class in your project?

    I would definitely say that i use general OOPs concept in everewere of my project.In automation script
    i do not use too much,but i know  that my team developers are using



    4-Can you create an object from abstract class?If no,How are you going to access all of the method and variable from that class

    No,you cannot create an object from Abstract class.To be Able to Access these methods and variables you need to override them.(Extend from parent to child)


    5-Can you have normal and abstract method inside of abstract class?


    -->Yes ,you can have both of the method types inside of Abstract class

    -->please rewatch videos
    -->Please review the notes
    -->Please
     */

/*
1-What is interface?
-->Interface is a blueprint of the object like class whice has special method that be overridden to make new implimentation
You use "implements" keyword to make de class connected with interface

2- why do you need interface if you have abstract?
Because Interface have more Feature in Terms of accessing the multiple parents at the same time by OVVERRIDING




3-What is the diference bEtwen interface  keyword

Interface:
1-Interface is declared with "Interface" keyword
2-Interface can have only public abstract methods (Show of:default keyword-->except
3-To make a connection,we use "IMPLEMENTS"  keyword
***4- In interface you can implement the class as many as you want parents and once you extend  but it should came before implement
5-When you  initialize a variables in interface as default is it "Final Static"
6-Methods must be as default "Public abstract"
7-Cannot have Constructor


Abstract:
1-Abstract is declared with "Abstract" keyword
2-Abstract may or may not have regular methods
3-To make a connection we use "Extends"key word
***4-In abstract you can extend class Once(one extends keyword per class)
5-When you declare a variable in abstract there is no default key word
6-You can have access modifiers  for this.(no default keyword)
7-Can have constructor
 */
