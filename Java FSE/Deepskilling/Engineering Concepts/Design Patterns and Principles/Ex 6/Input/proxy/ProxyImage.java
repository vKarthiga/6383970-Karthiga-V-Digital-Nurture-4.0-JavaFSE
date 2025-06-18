package proxy;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("Creating RealImage...");
            realImage = new RealImage(fileName);
        } else {
            System.out.println("Using cached RealImage...");
        }
        realImage.display();
    }
}
