package proxy;

public class Main {
    public static void main(String[] args) {
        Image dogImage = new ProxyImage("dog.jpg");
        Image catImage = new ProxyImage("cat.jpg");

        System.out.println("First display of dog.jpg:");
        dogImage.display();

        System.out.println("\nSecond display of dog.jpg:");
        dogImage.display();

        System.out.println("\nFirst display of cat.jpg:");
        catImage.display();
    }
}
