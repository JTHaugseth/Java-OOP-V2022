package Step8;

import java.awt.*;

public abstract class Shape {

    private Color color;
    private boolean filled;
    private final int id;


    public Shape(int id, Color color, boolean filled) {
        this.id = id;
        this.color = color;
        this.filled = filled;
    }

    public Color getColor() {return color;}

    public void setColor(Color color) {this.color = color;}

    public boolean isFilled() {return filled;}

    public void setFilled(boolean filled) {this.filled = filled;}

    public int getId() {return id;}

    public abstract double getAreal();
    public abstract double getCircumference();


    public String toString(){
        if (this.isFilled()){
            return String.format("A shape with color of %s, id=%d and filled", color.toString(), id);
        }
        return String.format("A shape with color of %s, id=%d and not filled" , super.toString());
    }
}
