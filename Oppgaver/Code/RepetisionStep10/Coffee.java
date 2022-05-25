package RepetisionStep10;

public class Coffee {

    private double quantity;
    private CoffeeType coffeeType;

    public Coffee(double quantity, CoffeeType coffeeType) throws CoffeeException {
        this.quantity = quantity;
        this.coffeeType = coffeeType;
        if (quantity<0) throw new CoffeeException("Quantity has to be over 0");
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }
}
