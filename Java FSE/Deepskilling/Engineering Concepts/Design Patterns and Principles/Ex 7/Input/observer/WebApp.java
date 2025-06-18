package observer;

public class WebApp implements Observer {
    private final String user;

    public WebApp(String user) {
        this.user = user;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("WebApp - " + user + ": " + stockName + " is now $" + stockPrice);
    }
}
