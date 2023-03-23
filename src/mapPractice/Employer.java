package mapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Employer {

    /*
    -create an employee class with instance variables of name, city, age, id
    -create one constructor to initialize instance variables
    -create a method to generate random  employee id and use this id for employee
    -create employeeTest class
    -create 4 employee object and store them in a map
    -while storing employees in the map, use their ids
    -create a method to print only employee names from map
     */

    String name, city;
    Integer age, id;

    public Employer(String name, String city, Integer age) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.id = idGenerator();
    }

    public Integer idGenerator() {

        Random radom = new Random();
        return radom.nextInt(100000);

    }

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}







