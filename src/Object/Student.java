package Object;

import java.util.Random;

public class Student {
    int batchNumber;
    String firstname;
    String lastname;

    public void study() {
        int number = hourCreator();
        System.out.println(firstname + "studies for " + number + " hours");

    }

    public void sleep() {
        System.out.println(firstname + " sleeps for 5 hours");
    }

    public int hourCreator() {
        Random random = new Random();
        int hour = random.nextInt(12);

        return hour;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.study();
        student.firstname = "Alex";
        student.study();
        student.sleep();

        }

    }
