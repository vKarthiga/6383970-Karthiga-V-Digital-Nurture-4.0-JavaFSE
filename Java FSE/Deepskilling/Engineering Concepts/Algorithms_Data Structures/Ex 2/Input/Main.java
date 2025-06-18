import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shirt", "Clothing"),
            new Product(103, "Mobile", "Electronics"),
            new Product(104, "Shoes", "Footwear")
        };

        // Sort products by name for binary search
        Arrays.sort(products, (a, b) -> a.getProductName().compareToIgnoreCase(b.getProductName()));

        String searchName = "Mobile";

        System.out.println("🔍 Linear Search Result:");
        Product linearResult = SearchService.linearSearch(products, searchName);
        System.out.println(linearResult != null ? linearResult : "Product not found");

        System.out.println("\n🔍 Binary Search Result:");
        Product binaryResult = SearchService.binarySearch(products, searchName);
        System.out.println(binaryResult != null ? binaryResult : "Product not found");
    }
}
