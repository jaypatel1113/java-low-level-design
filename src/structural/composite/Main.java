package structural.composite;

import structural.composite.problem.ProductClass;
import structural.composite.problem.ProductBundleClass;
import structural.composite.solution.contract.CartItem;
import structural.composite.solution.item.Product;
import structural.composite.solution.item.ProductBundle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Individual Items
        ProductClass book1 = new ProductClass("Book", 500);
        ProductClass headphones1 = new ProductClass("Headphones", 1500);
        ProductClass charger1 = new ProductClass("Charger", 800);
        ProductClass pen1 = new ProductClass("Pen", 20);
        ProductClass notebook1 = new ProductClass("Notebook", 60);

        // Bundle: Iphone Combo
        ProductBundleClass iphoneCombo1 = new ProductBundleClass("iPhone Combo Pack");
        iphoneCombo1.addProduct(headphones1);
        iphoneCombo1.addProduct(charger1);

        // Bundle: School Kit
        ProductBundleClass schoolKit1 = new ProductBundleClass("School Kit");
        schoolKit1.addProduct(pen1);
        schoolKit1.addProduct(notebook1);

        // Add to cart logic
        List<Object> cart1 = new ArrayList<>();
        cart1.add(book1);
        cart1.add(iphoneCombo1);
        cart1.add(schoolKit1);

        // Display Cart
        double total1 = 0;
        System.out.println("Cart Details:\n");

        for (Object item : cart1) {
            if (item instanceof ProductClass) {
                ((ProductClass) item).display("  ");
                total1 += ((ProductClass) item).getPrice();
            } else if (item instanceof ProductBundleClass) {
                ((ProductBundleClass) item).display("  ");
                total1 += ((ProductBundleClass) item).getPrice();
            }
        }

        System.out.println("\nTotal Price: ₹" + total1);


        // looks too complex












        // Individual Products
        Product book = new Product("Atomic Habits", 499);
        Product phone = new Product("iPhone 15", 79999);
        Product earbuds = new Product("AirPods", 15999);
        Product charger = new Product("20W Charger", 1999);

        // Combo Deal
        ProductBundle  iphoneCombo = new ProductBundle("iPhone Essentials Combo");
        iphoneCombo.addItem(phone);
        iphoneCombo.addItem(earbuds);
        iphoneCombo.addItem(charger);

        // Back to School Kit
        ProductBundle  schoolKit = new ProductBundle("Back to School Kit");
        schoolKit.addItem(new Product("Notebook Pack", 249));
        schoolKit.addItem(new Product("Pen Set", 99));
        schoolKit.addItem(new Product("Highlighter", 149));

        // Add everything to cart
        List<CartItem> cart = new ArrayList<>();
        cart.add(book);
        cart.add(iphoneCombo);
        cart.add(schoolKit);

        // Display cart
        System.out.println("Your Amazon Cart:");
        double total = 0;
        for (CartItem item : cart) {
            item.display("  ");
            total += item.getPrice();
        }

        System.out.println("\nTotal: ₹" + total);
    }
}
