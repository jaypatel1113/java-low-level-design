package behavioral.visitor.solution.contract;

import behavioral.visitor.solution.products.DigitalProduct;
import behavioral.visitor.solution.products.GiftCard;
import behavioral.visitor.solution.products.PhysicalProduct;

public interface ItemVisitor {
    void visit(PhysicalProduct item);
    void visit(DigitalProduct item);
    void visit(GiftCard item);
}