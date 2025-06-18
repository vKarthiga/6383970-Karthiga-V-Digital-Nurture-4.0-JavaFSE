// MobileApp.java
package observer;

public class MobileApp implements Observer {
    private final String user;

    public MobileApp(String user) {
        this.user = user;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("MobileApp - " + user + ": " + stockName + " is now $" + stockPrice);
    }
}
