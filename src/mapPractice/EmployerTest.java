package mapPractice;

import java.util.HashMap;

public class EmployerTest {

    public static void main(String[] args) {
        Employer e1 = new Employer("Emma", "Chicago", 34);
        Employer e2 = new Employer("Alex", "Des Plains", 24);
        Employer e3=new Employer("Sam","Chicago",35);
        Employer e4=new Employer("David","Zion",40);

        HashMap<Integer,Employer>employeeMap=new HashMap<>();

        employeeMap.put(e1.id,e1);
        employeeMap.put(e2.id,e2);
        employeeMap.put(e3.id,e3);
        employeeMap.put(e4.id,e4);
        System.out.println(employeeMap);
        nameFinder(employeeMap);
    }
    public static void nameFinder(HashMap<Integer,Employer>map){
        for (Employer employer:map.values()){
            System.out.println( employer.name);
        }
    }


}