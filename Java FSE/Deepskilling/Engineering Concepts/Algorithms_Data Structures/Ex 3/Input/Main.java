public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(201, "Alice", 1200.0),
            new Order(202, "Bob", 450.0),
            new Order(203, "Charlie", 3200.5),
            new Order(204, "Diana", 990.75)
        };

        Order[] bubbleSorted = orders.clone();
        Order[] quickSorted = orders.clone();

        System.out.println("🟡 Original Orders:");
        printOrders(orders);

        OrderSorter.bubbleSort(bubbleSorted);
        System.out.println("\n🔵 Bubble Sorted Orders (Low to High):");
        printOrders(bubbleSorted);

        OrderSorter.quickSort(quickSorted, 0, quickSorted.length - 1);
        System.out.println("\n🔴 Quick Sorted Orders (Low to High):");
        printOrders(quickSorted);
    }

    public static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
