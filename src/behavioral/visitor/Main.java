package behavioral.visitor;

import behavioral.visitor.problem.DigitalProductP;
import behavioral.visitor.problem.GiftCardP;
import behavioral.visitor.problem.PhysicalProductP;
import behavioral.visitor.solution.contract.Item;
import behavioral.visitor.solution.contract.ItemVisitor;
import behavioral.visitor.solution.products.DigitalProduct;
import behavioral.visitor.solution.products.GiftCard;
import behavioral.visitor.solution.products.PhysicalProduct;
import behavioral.visitor.solution.visitors.InvoiceVisitor;
import behavioral.visitor.solution.visitors.ShippingCostVisitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> cartP = Arrays.asList(new PhysicalProductP(), new DigitalProductP(), new GiftCardP());

        for (Object item : cartP) {
            if (item instanceof PhysicalProductP) {
                PhysicalProductP physicalProduct = (PhysicalProductP) item;
                physicalProduct.printInvoice();
                double shippingCost = physicalProduct.calculateShippingCost();
                System.out.println("Shipping cost: " + shippingCost + "\n");
            }
            else if (item instanceof DigitalProductP) {
                DigitalProductP digitalProduct = (DigitalProductP) item;
                digitalProduct.printInvoice();
                System.out.println("No shipping cost for Digital Product." + "\n");
            }
            else if (item instanceof GiftCardP) {
                GiftCardP giftCard = (GiftCardP) item;
                giftCard.printInvoice();
                double discount = giftCard.calculateDiscount();
                System.out.println("Discount applied: " + discount + "\n");
            }
        }




        // we are using OBJECT TYPE
        // if there are 100 diff types of products then ??? if else with instance of ???

        System.out.println("\n\n============================\n\n");


        List<Item> items = new ArrayList<>();
        items.add(new PhysicalProduct("Shoes", 1.2));
        items.add(new DigitalProduct("Ebook", 100));
        items.add(new GiftCard("TEST500", 500));

        ItemVisitor invoiceGenerator = new InvoiceVisitor();
        ItemVisitor shippingCalculator = new ShippingCostVisitor();

        for (Item item : items) {
            item.accept(invoiceGenerator);
            item.accept(shippingCalculator);

            System.out.println();
        }
    }
}
