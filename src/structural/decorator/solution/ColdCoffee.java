package structural.decorator.solution;

import structural.decorator.solution.contract.Coffee;

public class ColdCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 10.0;
    }
}
