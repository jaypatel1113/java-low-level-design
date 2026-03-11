package structural.flyweigh;

import structural.flyweigh.problem.ForestP;
import structural.flyweigh.solution.Forest;

public class Main {
    public static void main(String[] args) {
        ForestP forestP = new ForestP();

        // Planting 1 million trees
        for(int i = 0; i < 1000000; i++) {
            forestP.plantTree(i, i, "Oak", "Green", "Rough");
        }

        System.out.println("Planted 1 million trees.");




        Forest forest = new Forest();

        // Planting 1 million trees
        for(int i = 0; i < 1000000; i++) {
            forest.plantTree(i, i, "Oak", "Green", "Rough");
        }

        System.out.println("Planted 1 million trees.");
    }
}
