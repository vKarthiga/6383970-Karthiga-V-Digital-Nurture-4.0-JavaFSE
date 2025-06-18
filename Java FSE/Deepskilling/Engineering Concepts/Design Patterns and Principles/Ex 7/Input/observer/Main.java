package observer;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("Alice");
        Observer webApp = new WebApp("Bob");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        System.out.println("\nUpdating stock data to AAPL at $145.20");
        stockMarket.setStockData("AAPL", 145.20);

        System.out.println("\nUpdating stock data to GOOG at $2738.65");
        stockMarket.setStockData("GOOG", 2738.65);

        System.out.println("\nRemoving Bob (WebApp)");
        stockMarket.deregisterObserver(webApp);

        System.out.println("\nUpdating stock data to TSLA at $622.50");
        stockMarket.setStockData("TSLA", 622.50);
    }
}
