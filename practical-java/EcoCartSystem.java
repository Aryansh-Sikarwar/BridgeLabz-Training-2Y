public class EcoCartSystem {
    public static void main(String[] args) {

        
        OrganicProduct p1 = new OrganicProduct(101, "Organic Apple", 100);
        RecycledProduct p2 = new RecycledProduct(201, "Recycled Notebook", 200);
        OrganicProduct p3 = new OrganicProduct(102, "Organic Banana", 50);

        System.out.println("1. Displaying Product Info (Using displayProductInfo)");
        p1.displayProductInfo();
        p2.displayProductInfo();
        p3.displayProductInfo();
        System.out.println();

        
        Cart cart1 = new Cart(5);
        Cart cart2 = new Cart(5);

        System.out.println("2. Adding Products to Cart");
        
        cart1.addItem(p1);

        
        cart1.addItem(p2, p3);

        
        cart1.addItem(101, 3);
        System.out.println();

        
        System.out.println("3. Printing Cart Items (printCartItems)");
        cart1.printCartItems();
        System.out.println();

        
        System.out.println("4. Using Static Method (Cart.getCartCount())");
        System.out.println("Total carts created: " + Cart.getCartCount());
        System.out.println();

        
        System.out.println("5. Printing Bill (Using TAX_RATE)");
        cart1.printBill();
        System.out.println();

        
        System.out.println("6. Using EcoRules Class");
        EcoRules.showRules();
    }
}
