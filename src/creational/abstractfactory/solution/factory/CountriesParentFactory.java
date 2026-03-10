package creational.abstractfactory.solution.factory;

import creational.abstractfactory.solution.contract.RegionalFactory;
import creational.abstractfactory.solution.models.Country;

public class CountriesParentFactory {
    public static RegionalFactory getFactory(Country country) {
        switch (country) {
            case INDIA: return new IndiaFactory();
            case USA: return new USFactory();
            default: return null;
        }
    }
}
