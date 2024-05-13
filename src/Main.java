import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        while (true) {
            System.out.println("1. Add Product to Cart");
            System.out.println("2. View Cart");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.next();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    Product product = new Product(name, price, quantity);
                    cart.addItem(product);
                    break;
                case 2:
                    cart.displayCart();
                    break;
                case 3:
                    System.out.println("Thank you for shopping with us!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}