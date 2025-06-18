import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nInventory Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. View Inventory");
            System.out.println("5. Search Product");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID, Name, Quantity, Price: ");
                    int id = scanner.nextInt();
                    String name = scanner.next();
                    int qty = scanner.nextInt();
                    double price = scanner.nextDouble();
                    inventory.addProduct(new Product(id, name, qty, price));
                }
                case 2 -> {
                    System.out.print("Enter ID to update: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter new Name, Quantity, Price: ");
                    String name = scanner.next();
                    int qty = scanner.nextInt();
                    double price = scanner.nextDouble();
                    inventory.updateProduct(id, name, qty, price);
                }
                case 3 -> {
                    System.out.print("Enter ID to delete: ");
                    int id = scanner.nextInt();
                    inventory.deleteProduct(id);
                }
                case 4 -> inventory.viewInventory();
                case 5 -> {
                    System.out.print("Enter ID to search: ");
                    int id = scanner.nextInt();
                    Product p = inventory.searchProduct(id);
                    System.out.println(p != null ? p : "Product not found.");
                }
                case 6 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }
            }
        }
    }
}
