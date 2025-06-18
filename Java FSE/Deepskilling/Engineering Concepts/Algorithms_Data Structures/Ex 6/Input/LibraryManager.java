import java.util.Arrays;

public class LibraryManager {
    private Book[] books;
    private int size;

    public LibraryManager(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public void addBook(Book book) {
        if (size < books.length) {
            books[size++] = book;
        } else {
            System.out.println("❌ Library is full.");
        }
    }

    // Linear search by title
    public Book linearSearch(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    // Binary search by title (must be sorted)
    public Book binarySearch(String title) {
        Arrays.sort(books, 0, size); // Sort before binary search
        int left = 0, right = size - 1;
        title = title.toLowerCase();

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = books[mid].title.compareTo(title);

            if (cmp == 0) return books[mid];
            if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public void displayBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
}
