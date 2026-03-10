package creational.builder.solution;

import java.util.List;

public class BurgerMeal {
    // required fields
    private final String bunType, patty;

    // optional fields
    private final boolean hasCheese;
    private final List<String> toppings;
    private final String side, drink;

    // its private coz it cannot be called directly
    private BurgerMeal(BurgerBuilder builder) {
        this.bunType = builder.bunType;
        this.patty = builder.patty;
        this.hasCheese = builder.hasCheese;
        this.toppings = builder.toppings;
        this.side = builder.side;
        this.drink = builder.drink;
    }


    @Override
    public String toString() {
        return "BurgerMeal {" +
                "bunType='" + bunType + '\'' +
                ", patty='" + patty + '\'' +
                ", hasCheese=" + hasCheese +
                ", toppings=" + toppings +
                ", side='" + side + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }


    // inner class
    public static class BurgerBuilder {
        // required
        private String bunType, patty;

        // optional
        private boolean hasCheese;
        private List<String> toppings;
        private String side, drink;

        // only accept required params
        public BurgerBuilder(String bunType, String patty) {
            this.bunType = bunType;
            this.patty = patty;
        }


        // add setters for each optional fields
        public BurgerBuilder addCheese(boolean hasCheese) {
            this.hasCheese = hasCheese;
            return this;
        }

        public BurgerBuilder addToppings(List<String> toppings) {
            this.toppings = toppings;
            return this;
        }

        public BurgerBuilder setSide(String side) {
            this.side = side;
            return this;
        }

        public BurgerBuilder addDrink(String drink) {
            this.drink = drink;
            return this;
        }

        // build method to create burger meal
        public BurgerMeal build() {
            return new BurgerMeal(this);
        }
    }
}
