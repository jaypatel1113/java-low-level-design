package structural.decorator;

public class BaseCoffee implements Component {
    @Override
    public String getDescription() { return "Coffee"; }

    @Override
    public double getCost() { return 1.00; }
}
