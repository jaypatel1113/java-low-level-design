package structural.decorator.solution;

import structural.decorator.solution.contract.Coffee;

public class BaseCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
