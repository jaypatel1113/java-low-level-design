package behavioral.visitor.solution.contract;

public interface Item {
    void accept(ItemVisitor visitor);
}
