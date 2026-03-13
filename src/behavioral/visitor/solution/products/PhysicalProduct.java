package behavioral.visitor.solution.products;

import behavioral.visitor.solution.contract.Item;
import behavioral.visitor.solution.contract.ItemVisitor;

public class PhysicalProduct implements Item {
    public String name;
    public double weight;

    public PhysicalProduct(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void accept(ItemVisitor visitor) {
        visitor.visit(this);
    }
}
