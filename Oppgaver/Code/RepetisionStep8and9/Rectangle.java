package RepetisionStep8and9;

public class Rectangle extends Shape {

    public double width;
    public double height;
    final MovablePoint topRight;
    final MovablePoint bottomLeft;

    public Rectangle(double width, double height, int id, MovablePoint topRight, MovablePoint bottomLeft) {
        super(id);
        this.width = width;
        this.height = height;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
    }

    public double getWidth() {return width;}

    public void setWidth(double width) {this.width = width;}

    public double getHeight() {return height;}

    public void setHeight(double height) {this.height = height;}

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getCircumference() {
        return (width * 2) + (height * 2);
    }

    @Override
    public String toString() {
        return String.format("A rectangle with width %1.2f, height %1.2f, area %1.2f and circumference %1.2f, %s, %s", getWidth(), getHeight(), getArea(),
                getCircumference(), this.topRight, this.bottomLeft);
    }

    @Override
    public void moveUp(double distance) {
        this.topRight.moveUp(distance);
        this.bottomLeft.moveUp(distance);
    }

    @Override
    public void moveDown(double distance) {
        this.topRight.moveDown(distance);
        this.bottomLeft.moveDown(distance);
    }

    @Override
    public void moveRight(double distance) {
        this.topRight.moveRight(distance);
        this.bottomLeft.moveRight(distance);
    }

    @Override
    public void moveLeft(double distance) {
        this.topRight.moveLeft(distance);
        this.bottomLeft.moveLeft(distance);
    }
}
