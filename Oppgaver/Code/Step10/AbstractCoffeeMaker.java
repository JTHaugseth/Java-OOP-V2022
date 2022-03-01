package Step10;

import java.util.HashMap;

public abstract class  AbstractCoffeeMaker {

    HashMap<CoffeeType, CoffeeConfiguration> configMap;

    abstract void brewCoffee(CoffeeType coffeeType);

}
