package toString_Method;

public class Main {

    public static void main (String[] args) {
        // toString() = special method that all objects inherit,
        //              that returns a string that "textually represents" and object.
        //              can be used both implicitly and explicitly.

        Car car = new Car();

        System.out.println(car.toString()); // explicitly
        //System.out.println(car); //implicitly
    }
}
