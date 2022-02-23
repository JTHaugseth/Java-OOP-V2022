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
    public double getradius() {
        return 0;
    }
}
