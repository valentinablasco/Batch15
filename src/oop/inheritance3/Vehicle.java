package oop.inheritance3;

public class Vehicle {

        protected String model;
        int yer;
        public  String brand;

        public void  move(){
            System.out.println("Vehicle is moving");
        }
        public boolean stop(){
            System.out.println("Vehicle is stopping");
            return true;
        }
        protected boolean start(){
            System.out.println("Vehicle is starting");
            return true;
        }
        Object accelerate(){
            System.out.println("Vehicle acceleriate");
            return 3;
        }

        public Vehicle(String model, int yer, String brand) {
            this.model = model;
            this.yer = yer;
            this.brand = brand;
        }
    }