package RepetisionStep8and9;

public class MovablePoint implements Movable {

    public double x = 0;
    public double y = 0;

    public MovablePoint(double x, double y) {
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
        return String.format("MovablePoint x = %1.2f and y = %1.2f", this.x, this.y);
    }
}
