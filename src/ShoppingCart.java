class ShoppingCart {
    Product[] items;
    int itemCount;
    ShoppingCart() {
        items = new Product[100];
        itemCount = 0;
    }
    void addItem(Product product) {
        if (itemCount < items.length) {
            items[itemCount] = product;
            itemCount++;
            System.out.println("Product added to cart.");
        } else {
            System.out.println("Sorry, the cart is full.");
        }
    }
    void displayCart() {
        if (itemCount == 0) {
            System.out.println("Your shopping cart is empty.");
        } else {
            System.out.println("Shopping Cart:");
            for (int i = 0; i < itemCount; i++) {
                Product item = items[i];
                System.out.println(item.name + " - $" + item.price + " - Quantity: " + item.quantity);
            }
        }
    }
}