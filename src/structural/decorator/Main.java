package structural.decorator;

import structural.decorator.problem.*;
import structural.decorator.solution.BaseCoffee;
import structural.decorator.solution.contract.Coffee;
import structural.decorator.solution.decorator.MilkDecorator;
import structural.decorator.solution.decorator.SugarDecorator;
import structural.decorator.solution.decorator.WhippedCreamDecorator;

public class Main {
    public static void main(String[] args) {
        // base coffee
        CoffeeType coffeeType = new CoffeeType();

        // combination coffee
        MilkCoffee milkCoffee1 = new MilkCoffee();
        MilkSugarCaramel milkSugarCaramel1 = new MilkSugarCaramel();
        MilkSugarCoffee milkSugarCoffee1 = new MilkSugarCoffee();
        SugarCoffee sugarCoffee1 = new SugarCoffee();

        // for every new combination it will have 2^n new classes




        Coffee coffee = new BaseCoffee();
        System.out.println(coffee.getDescription() + " = " + coffee.getCost());

        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println(milkCoffee.getDescription() + " = " + milkCoffee.getCost());

        Coffee milkSugarCoffee = new SugarDecorator(new MilkDecorator(coffee));
        // Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println(milkSugarCoffee.getDescription() + " = " + milkSugarCoffee.getCost());

        Coffee deluxeCoffee = new WhippedCreamDecorator(new SugarDecorator(new MilkDecorator(coffee)));
        System.out.println(deluxeCoffee.getDescription() + " = " + deluxeCoffee.getCost());


        // you can also create cold coffee with those decorators
    }
}
