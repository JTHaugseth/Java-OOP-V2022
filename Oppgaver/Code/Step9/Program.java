package Step9;

import java.util.ArrayList;

public class Program {

    public void checkShapes() {
        Circle circle = new Circle(new MovablePoint(2, 2), 2);
        Rectangle rectangle = new Rectangle(new MovablePoint(1, 0), new MovablePoint(6, 3), 5,3);
        Square square = new Square(new MovablePoint(3, 3), new MovablePoint(6, 6), 3,3);

        ArrayList<Shape> list = new ArrayList<>();

        list.add(circle);
        list.add(rectangle);
        list.add(square);

        System.out.println(list);
        System.out.println();

        circle.moveUp(2);
        rectangle.moveDown(1);
        square.moveRight(2);

        System.out.println(list);

    }
}
