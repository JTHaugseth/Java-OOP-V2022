package Step10;

public class BasicCoffeeMaker extends AbstractCoffeeMaker{

    protected Grinder grinder;
    protected BrewingUnit brewingUnit;

    public BasicCoffeeMaker() {
        super();
        this.configMap.put(CoffeeType.FILTER, new CoffeeConfiguration(30, 180));
        grinder = new Grinder();
        brewingUnit = new BrewingUnit();
    }

    @Override
    public Coffee brewCoffee(CoffeeType coffeeType) throws CoffeeException {
        switch (coffeeType) {
            case FILTER:
                System.out.println("lol");
                break;
            default:
                throw new CoffeeException("coffe failure......");
        }
        return null; // ????
    }
}
