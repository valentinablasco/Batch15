package mapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentInfoTask {

    /*
    FirstName: David
LastName: Pena
Age: 25
Gender: M
City: Chicago

FirstName: Jeremiah
LastName: Michaelson
Age: 15
Gender: M
City: LakeForest

FirstName: Michael
LastName: White
Age: 35
Gender: M
City: Winnetka

FirstName: Sarah
LastName: Star
Age: 29
Gender: F
City: Chicago

Store student 'Information in to maps
Store those student information into List
From list of student out of Chicago,-->"You can join Online"
*/
    public static void main(String[] args) {
        HashMap<String, String> student1 = new HashMap();
        student1.put("FistName", "David");
        student1.put("LastName", "Pena");
        student1.put("Age", "25");
        student1.put("Gender", "M");
        student1.put("City", "Chicago");
        System.out.println(student1);

        HashMap<String, String> student2 = new HashMap();
        student2.put("FistName", "Jeremiah");
        student2.put("LastName", "Michaelson");
        student2.put("Age", "15");
        student2.put("Gender", "M");
        student2.put("City", "LakeForest");

        HashMap<String, String> student3 = new HashMap();
        student3.put("FistName", "Michael");
        student3.put("LastName", "White");
        student3.put("Age", "35");
        student3.put("Gender", "M");
        student3.put("City", "Winnetka");

        HashMap<String, String> student4 = new HashMap();
        student4.put("FistName", "Sarah");
        student4.put("LastName", "Star");
        student4.put("Age", "29");
        student4.put("Gender", "F");
        student4.put("City", "Chicago");

        List<HashMap<String, String>> listOfStudents = new ArrayList();
        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        listOfStudents.add(student4);
        System.out.println(listOfStudents);

        //find student who are age of 30 or younger ,they are from Chicago
        for (HashMap<String, String> student : listOfStudents) {
            // student.get("City").equalsIgnoreCase("Chicago")
            //student.get("Age")<=30
            if (Integer.parseInt(student.get(" Age")) <= 30 && student.get("City").equalsIgnoreCase("Chicago")) {

                System.out.println(student.get("First Name") + "is from Chicago and age of 30 or less");
            }


            //for (HashMap<String, String> student : listOfStudents) {
            //if (!student.get("City").equalsIgnoreCase("Chicago")) {
            // System.out.println(" You can join Online");
        }
    }
    // for loop with index number
    // for (int i = 0; i < listOfStudents.size(); i++) {
    // if (!listOfStudents.get(i).get("City").equalsIgnoreCase("Chicago")) {
    // System.out.println(listOfStudents.get(i).get("FistName") + " *** You can join Online *** ");


    //List<List<String>>result1=fullNameFinder(listOfStudents);
    //HashMap<String,List> result2=fullNameFinder1( listOfStudents);

    /* create a method
    // pass a parameter as list  // List< HashMap<  String, String  >  > listOfStudents
    // return all student firstNames in one List and lastNames in other List
    public static List<List<String>> fullNameFinder(List<HashMap<String, String>> list) {
        List firstNames = new ArrayList();
        List lastNames = new ArrayList();
        List<List<String>> fullNames = new ArrayList<>();
        for (HashMap<String, String> student : list) {
            firstNames.add(student.get("FistName"));
            lastNames.add(student.get("LastName"));
        }
        fullNames.add(firstNames);
        fullNames.add(lastNames);
        System.out.println(fullNames);
        return fullNames;
    }
    public static HashMap<String, List> fullNameFinder1(List<HashMap<String, String>> list) {
        List firstNames = new ArrayList();
        List lastNames = new ArrayList();
        List cities=new ArrayList<>();
        //create another list for cities
        HashMap<String, List> map1 = new HashMap<>();
        for (HashMap<String, String> student : list) {
            //find and addvto the list you created
            firstNames.add(student.get("FistName"));
            lastNames.add(student.get("LastName"));
            cities.add(student.get("Cities"));
        }
        //add ypour city list to the map
        map1.put("Cities",cities);
        map1.put("FirstNames", firstNames);
        map1.put("LastNames", lastNames);

        System.out.println(map1);
        return map1;

     */

}

