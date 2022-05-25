package RepetisionStep8and9;

public abstract class Shape implements Movable {
    private final int id;

    public Shape(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public abstract double getArea();
    public abstract double getCircumference();

    public String toString() {
        return null;
    }
}
