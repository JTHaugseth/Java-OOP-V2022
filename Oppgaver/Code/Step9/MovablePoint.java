package Step9;

public class MovablePoint implements Movable {
    double x = 0;
    double y = 0;

    MovablePoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp(double distance) {
        this.y += distance;
    }

    @Override
    public void moveDown(double distance) {
        this.y -= distance;
    }

    @Override
    public void moveRight(double distance) {
        this.x += distance;
    }

    @Override
    public void moveLeft(double distance) {
        this.x -= distance;
    }

    @Override
    public String toString() {
        return String.format("MovablePoint { x= %f, y = %f }", this.x, this.y);
    }
}
