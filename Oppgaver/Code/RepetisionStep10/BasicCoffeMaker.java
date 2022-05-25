package RepetisionStep10;

import java.util.HashMap;
import java.util.logging.Filter;

public class BasicCoffeMaker extends AbstractCoffeeMaker {

    public Grinder grinder;
    public BrewingUnit brewingunit;

    public BasicCoffeMaker(Grinder grinder, BrewingUnit brewingunit) {
        super();
        this.configMap.put(CoffeeType.FILTER, new CoffeeConfiguration(30, 180));
        this.grinder = grinder;
        this.brewingunit = brewingunit;
    }

    @Override
    public Coffee brewCoffee(CoffeeType coffeeType) throws CoffeeException {
        switch (coffeeType) {

            default -> throw new CoffeeException("CoffeeType can only be FILTER");
        }
    }





}
