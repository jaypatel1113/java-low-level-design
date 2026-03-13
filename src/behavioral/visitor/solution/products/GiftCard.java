package behavioral.visitor.solution.products;

import behavioral.visitor.solution.contract.Item;
import behavioral.visitor.solution.contract.ItemVisitor;

public class GiftCard implements Item {
    public String code;
    public double amount;

    public GiftCard(String code, double amount) {
        this.code = code;
        this.amount = amount;
    }

    public void accept(ItemVisitor visitor) {
        visitor.visit(this);
    }
}
