package behavioral.visitor.solution.products;

import behavioral.visitor.solution.contract.Item;
import behavioral.visitor.solution.contract.ItemVisitor;

public class DigitalProduct implements Item {
    public String name;
    public int downloadSizeInMB;

    public DigitalProduct(String name, int downloadSizeInMB) {
        this.name = name;
        this.downloadSizeInMB = downloadSizeInMB;
    }

    public void accept(ItemVisitor visitor) {
        visitor.visit(this);
    }
}
