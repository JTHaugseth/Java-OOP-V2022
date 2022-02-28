package Step9;

public class Square extends Shape{

    final MovablePoint topRight;
    final MovablePoint bottomLeft;
    double width = 0;
    double height = 0;

    public Square(MovablePoint topRight, MovablePoint bottomLeft, double width, double height) {
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

    @Override
    public double getAreal() {
        return width * height;
    }
    @Override
    public double getCircumference() {
        return width * 4;
    }

    public String toString(){
        return String.format("A Square with topRight position = %s, bottomLeft position = %s, width = %1.1f and height = %1.1f\n"
                , this.topRight, this.bottomLeft, this.width, this.height);
    }

    public String uniqueSquareMethod() {
        return String.format("This is a unique square method!");
    }
}
