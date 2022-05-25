package RepetisionStep10;

import java.util.HashMap;

public abstract class AbstractCoffeeMaker {

    protected HashMap<CoffeeType, CoffeeConfiguration> configMap;

    public AbstractCoffeeMaker() {
        this.configMap = new HashMap<CoffeeType, CoffeeConfiguration>();
    }

    public abstract Coffee brewCoffee(CoffeeType coffeeType) throws CoffeeException;

}
