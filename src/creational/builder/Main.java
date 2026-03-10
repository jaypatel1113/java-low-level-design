package creational.builder;

import creational.builder.problem.BurgerMealProblem;
import creational.builder.solution.BurgerMeal;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BurgerMealProblem plainBurger1 = new BurgerMealProblem("wheat", "veg", null, null, false);
        BurgerMealProblem burgerWithCheese1 = new BurgerMealProblem("wheat", "veg", null, null, true);
        BurgerMealProblem loadedBurger1 = new BurgerMealProblem("wheat", "chicken", "fried", Arrays.asList("lettuce", "onion"), false);
        System.out.println(plainBurger1);
        System.out.println(burgerWithCheese1);
        System.out.println(loadedBurger1);

        // it's not proper - if there is 100 params, and you only need first and last will you write rest 98 in between as null?

        System.out.print("\n==============\n\n");


        // Creating burger with only required fields
        BurgerMeal plainBurger = new BurgerMeal.BurgerBuilder("wheat", "veg")
                .build();
        System.out.println(plainBurger);


        // Burger with cheese only
        BurgerMeal burgerWithCheese = new BurgerMeal.BurgerBuilder("wheat", "veg")
                .addCheese(true)
                .build();
        System.out.println(burgerWithCheese);

        // Fully loaded burger
        List<String> toppings = Arrays.asList("lettuce", "onion", "jalapeno");
        BurgerMeal loadedBurger = new BurgerMeal.BurgerBuilder("multigrain", "chicken")
                .addCheese(true)
                .addToppings(toppings)
                .setSide("fries")
                .addDrink("coke")
                .build();
        System.out.println(loadedBurger);
    }
}
