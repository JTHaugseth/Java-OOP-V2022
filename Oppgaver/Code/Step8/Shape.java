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

    public String ToString(){
        if (this.isFilled()){
            return String.format("A shape with color of %s, id=%s and filled", color.toString(), id);
        }
        return String.format("A shape with color of %s, id=%s and not filled" , color.toString(), id);
    }
}