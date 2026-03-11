package structural.composite.solution.item;

import structural.composite.solution.contract.CartItem;

import java.util.ArrayList;
import java.util.List;

public class ProductBundle implements CartItem {
    private String bundleName;
    private List<CartItem> products;

    public ProductBundle(String bundleName) {
        this.bundleName = bundleName;
        this.products = new ArrayList<>();
    }

    public void addItem(CartItem product) {
        products.add(product);
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (CartItem product : products) {
            price += product.getPrice();
        }
        return price;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "Bundle: " + bundleName);
        for (CartItem product : products) {
            product.display(indent + "  ");
        }
    }
}
