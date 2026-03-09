package structural.decorator;

public class MilkDecorator implements Component {
    private final Component wrapped;

    public MilkDecorator(Component c) { this.wrapped = c; }

    @Override
    public String getDescription() { return wrapped.getDescription() + ", Milk"; }

    @Override
    public double getCost() { return wrapped.getCost() + 0.50; }
}
