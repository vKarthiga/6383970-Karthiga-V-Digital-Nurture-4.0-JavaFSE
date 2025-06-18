public class Book implements Comparable<Book> {
    int bookId;
    String title;
    String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title.toLowerCase(); // Normalize for case-insensitive search
        this.author = author;
    }

    @Override
    public String toString() {
        return bookId + " | " + title + " | " + author;
    }

    // Needed for binary search
    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }
}
