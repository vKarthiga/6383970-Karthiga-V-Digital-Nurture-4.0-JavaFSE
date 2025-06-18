import java.util.*;

public class Inventory {
    private Map<Integer, Product> products = new LinkedHashMap<>();

    public void addProduct(Product p) {
        products.put(p.getId(), p);
    }

    public boolean updateProduct(int id, String name, int quantity, double price) {
        Product p = products.get(id);
        if (p != null) {
            p.setName(name);
            p.setQuantity(quantity);
            p.setPrice(price);
            return true;
        }
        return false;
    }

    public boolean deleteProduct(int id) {
        return products.remove(id) != null;
    }

    public void viewInventory() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product p : products.values()) {
                System.out.println(p);
            }
        }
    }

    public Product searchProduct(int id) {
        return products.get(id);
    }
}
