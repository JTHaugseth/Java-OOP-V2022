package Inheritance;

public class Main {

    public static void main(String[] args) {
        // inheritance = the process where one class acquires,
        //               the attributes and methods of another.

        Car car = new Car();
        Bicycle bike = new Bicycle();

        // Fra Vehicle
        car.go();
        bike.stop();

        // Fra classene selv
        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
}
