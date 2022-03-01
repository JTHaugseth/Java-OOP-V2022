package Step10;

public class Coffee{

    private CoffeeType coffeeType;
    private double quantity;

    public Coffee(CoffeeType coffeeType, double quantity) {
        this.coffeeType = coffeeType;
        this.quantity = quantity;
    }

    public CoffeeType getCoffeeType() {return coffeeType;}

    public void setCoffeeType(CoffeeType coffeeType) {this.coffeeType = coffeeType;}

    public double getQuantity() {return quantity;}

    public void setQuantity(double quantity) {this.quantity = quantity;}
}
