package creational.builder.problem;

import java.util.List;

public class BurgerMealProblem {
    // Mandatory components
    private final String bun;
    private final String patty;

    // Optional components
    private final String sides;
    private final List<String> toppings;
    private final boolean cheese;

    @Override
    public String toString() {
        return "BurgerMealProblem {" +
                "bun='" + bun + '\'' +
                ", patty='" + patty + '\'' +
                ", sides='" + sides + '\'' +
                ", toppings=" + toppings +
                ", cheese=" + cheese +
                '}';
    }

    // Constructor trying to handle all combinations
    public BurgerMealProblem(String bun, String patty, String sides, List<String> toppings, boolean cheese) {
        this.bun = bun;
        this.patty = patty;
        this.sides = sides;
        this.toppings = toppings;
        this.cheese = cheese;
    }

    // if there is 100 fields some mandatory and some optional
    // how much you will create constructor ??
}
