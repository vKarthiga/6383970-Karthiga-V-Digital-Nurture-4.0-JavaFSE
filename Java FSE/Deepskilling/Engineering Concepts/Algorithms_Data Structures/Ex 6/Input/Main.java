public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager(10);

        manager.addBook(new Book(101, "The Alchemist", "Paulo Coelho"));
        manager.addBook(new Book(102, "1984", "George Orwell"));
        manager.addBook(new Book(103, "To Kill a Mockingbird", "Harper Lee"));

        System.out.println("📚 All Books:");
        manager.displayBooks();

        System.out.println("\n🔍 Linear Search for '1984':");
        Book found1 = manager.linearSearch("1984");
        System.out.println(found1 != null ? found1 : "Not found");

        System.out.println("\n🔍 Binary Search for 'The Alchemist':");
        Book found2 = manager.binarySearch("The Alchemist");
        System.out.println(found2 != null ? found2 : "Not found");
    }
}
