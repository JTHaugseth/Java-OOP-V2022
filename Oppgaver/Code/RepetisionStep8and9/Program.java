package RepetisionStep8and9;

import java.util.HashMap;

public class Program {

    HashMap<Integer, Shape> shapes = new HashMap<>();

    public void runProgram() {
        createShapes();
    }

    public void createShapes() {
        Shape shape1 = new Circle(5, 1, new MovablePoint(5,5));
        Shape shape2 = new Rectangle(8, 4, 2, new MovablePoint(4, 3), new MovablePoint(8,6));
        Shape shape3 = new Square(6, 6, 3);
        Shape shape4 = new Circle(5, 4, new MovablePoint(3,4));
        Shape shape5 = new Rectangle(8, 4, 5,new MovablePoint(5, 4), new MovablePoint(10,8) );
        Shape shape6 = new Square(6, 6, 6);
        Shape shape7 = new Circle(5, 7, new MovablePoint(7,2));
        Shape shape8 = new Rectangle(8, 4, 8, new MovablePoint(2, 1), new MovablePoint(4,2));
        Shape shape9 = new Square(6, 6, 9);
        Shape shape10 = new Square(6, 6, 10);



        shapes.put(1, shape1);
        shapes.put(2, shape2);
        shapes.put(3, shape3);
        shapes.put(4, shape4);
        shapes.put(5, shape5);
        shapes.put(6, shape6);
        shapes.put(7, shape7);
        shapes.put(8, shape8);
        shapes.put(9, shape9);
        shapes.put(10, shape10);

        System.out.println(shape1);
        System.out.println(shape2);
        System.out.println(shape3);
        System.out.println(shape4);
        System.out.println(shape5);
        System.out.println(shape6);
        System.out.println(shape7);
        System.out.println(shape8);
        System.out.println(shape9);
        System.out.println(shape10);
    }
}
