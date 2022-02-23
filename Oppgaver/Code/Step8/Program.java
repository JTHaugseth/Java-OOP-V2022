package Step8;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

import static java.awt.Color.RED;

public class Program {

    HashMap<Integer, Shape> shapes = new HashMap<>();
    Circle [] circle = new Circle[10];
    Random random = new Random();

    public void checkCircles() {

        for(int i = 0; i < 10; i++) {

            int x = random.nextInt(100)+1;
            boolean y = random.nextBoolean();

            circle[i] = new Circle((i), (x), RED, (y));
            shapes.put((i), circle[i]);
        }

        System.out.println(shapes);
        System.out.println();
        System.out.println(shapes.get(5));

    }

}
