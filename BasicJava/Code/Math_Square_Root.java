import java.util.Scanner;
import java.lang.Math;

public class Math_Square_Root {

    public static void main(String[] args) {

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side X: ");
        x = scanner.nextDouble();
        System.out.println("Enter side Y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is: "+z);

        scanner.close();
    }
}
