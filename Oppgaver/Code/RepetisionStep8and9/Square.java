package RepetisionStep8and9;

public class Square extends Shape {

    public double width;
    public double height;

    public Square(double width, double height, int id) {
        super(id);
        this.width = width;
        this.height = height;
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
        return String.format("A square with width %1.2f, height %1.2f, area %1.2f and circumference %1.2f", getWidth(), getHeight(), getArea(), getCircumference());
    }

    @Override
    public void moveUp(double distance) {

    }

    @Override
    public void moveDown(double distance) {

    }

    @Override
    public void moveRight(double distance) {

    }

    @Override
    public void moveLeft(double distance) {

    }
}
