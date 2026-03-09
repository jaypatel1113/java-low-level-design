package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Component coffee = new BaseCoffee();
        System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());

        Component coffeeWithMilk = new MilkDecorator(coffee);
        System.out.println(coffeeWithMilk.getDescription() + " -> $" + coffeeWithMilk.getCost());
    }
}
