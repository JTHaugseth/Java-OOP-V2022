package Step8;

import java.awt.*;

public class Circle extends Shape {

    private double radius;

    public Circle (int id, double radius, Color color, boolean filled){
        super(id, color, filled);
        this.radius = radius;
    }

    public double getRadius() {return radius;}

    public void setRadius(double radius) {this.radius = radius;}

    @Override
    public double getAreal() {
        return getRadius() * getRadius() * Math.PI;
    }
    @Override
    public double getCircumference() {
        return Math.PI * (getRadius() * 2);
    }
    @Override
    public String toString() {
        return String.format("Circle %s with radius = %s, which is a subclass of %s",getId(), radius, super.toString());
    }
}
