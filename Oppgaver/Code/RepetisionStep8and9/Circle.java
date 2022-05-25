package RepetisionStep8and9;

public class Circle extends Shape{

    public double radius;
    final MovablePoint centerPoint;


    public Circle(double radius, int id, MovablePoint centerPoint) {
        super(id);
        this.radius = radius;
        this.centerPoint = centerPoint;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (radius * radius) * Math.PI;
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("A circle with radius %1.2f, area %1.2f and circumference %1.2f, %s", getRadius(), getArea(), getCircumference(), this.centerPoint);
    }

    @Override
    public void moveUp(double distance) {
        this.centerPoint.moveUp(distance);
    }

    @Override
    public void moveDown(double distance) {
        this.centerPoint.moveDown(distance);
    }

    @Override
    public void moveRight(double distance) {
        this.centerPoint.moveRight(distance);
    }

    @Override
    public void moveLeft(double distance) {
        this.centerPoint.moveLeft(distance);
    }

}
