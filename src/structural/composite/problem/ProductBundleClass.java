package structural.composite.problem;

import java.util.ArrayList;
import java.util.List;

public class ProductBundleClass {
    private String bundleName;
    private List<ProductClass> productClasses;

    public ProductBundleClass(String bundleName) {
        this.bundleName = bundleName;
        this.productClasses = new ArrayList<>();
    }

    public void addProduct(ProductClass productClass) {
        productClasses.add(productClass);
    }

    public double getPrice() {
        double price = 0;
        for (ProductClass productClass : productClasses) {
            price += productClass.getPrice();
        }
        return price;
    }

    public void display(String indent) {
        System.out.println(indent + "Bundle: " + bundleName);
        for (ProductClass productClass : productClasses) {
            productClass.display(indent + "  ");
        }
    }
}
