package Step9;

import java.util.ArrayList;

public class Program {

    public void checkShapes() {
        /*Circle circle = new Circle(new MovablePoint(2, 2), 2);
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

        System.out.println(list);*/

        ArrayList<Shape> list = new ArrayList<>();
        Shape shape1;
        Shape shape2;
        Shape shape3;

        list.add(shape1 = new Circle(new MovablePoint(2, 2), 2));
        list.add(shape2 = new Rectangle(new MovablePoint(1, 0), new MovablePoint(6, 3), 5,3));
        list.add(shape3 = new Square(new MovablePoint(3, 3), new MovablePoint(6, 6), 3,3));

        for (Shape i : list) {
            System.out.println(i.getAreal());
            System.out.println(i.getCircumference());

            if (i instanceof Circle) {
                System.out.println(((Circle) i).uniqueCircleMethod());
                System.out.println();
            } else if (i instanceof Rectangle) {
                System.out.println(((Rectangle) i).uniqueRectangleMethod());
                System.out.println();
            } else if (i instanceof Square) {
                System.out.println(((Square) i).uniqueSquareMethod());
                System.out.println();
            } else {
                System.out.println("Something went wrong!");
            }
        }
    }
}
