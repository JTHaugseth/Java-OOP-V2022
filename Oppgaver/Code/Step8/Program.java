package Step8;

import java.awt.*;
import java.util.HashMap;

public class Program {

    HashMap<Integer, Shape> shapes = new HashMap<>();

    public void checkCircles() {
        Circle circle = new Circle(1, 2, Color.RED, true);
        System.out.println(circle);
    }
}
