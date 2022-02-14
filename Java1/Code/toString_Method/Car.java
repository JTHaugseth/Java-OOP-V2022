package toString_Method;

public class Car {

    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;

    public String toString() {

        String myString = make + "\n" + model + "\n" + color + "\n" + year;
        return myString;
    }
}
