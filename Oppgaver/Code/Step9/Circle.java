package Step9;

public class Circle extends Shape{

    final MovablePoint center;
    double radius;

    public Circle(MovablePoint center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {return radius;}
    public void setRadius(double radius) {this.radius = radius;}

    @Override
    public void moveUp(double distance) {
        this.center.moveUp(distance);
    }
    @Override
    public void moveDown(double distance) {
        center.moveDown(distance);
    }
    @Override
    public void moveRight(double distance) {
        this.center.moveRight(distance);
    }
    @Override
    public void moveLeft(double distance) {
        this.center.moveLeft(distance);
    }

    @Override
    public double getAreal() {return (radius * radius) * Math.PI;}
    @Override
    public double getCircumference() {return Math.PI * (radius * 2);}

    public String toString(){
        return String.format("A circle with center = %s and radius %1.0f\n", this.center, this.radius);
    }
}
