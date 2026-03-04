package LibrarySystem;

import java.util.*;

public class Library {
    private Map<Integer, User> users = new HashMap<>();
    private Map<Integer, Book> books = new HashMap<>();

    public void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public void addOrUpdateBook(Book book) {
        books.put(book.getBookId(), book);
    }

    public void deleteBook(int bookId) {
        books.remove(bookId);
    }

    public void reserveBook(int bookId, int userId) {
        if (books.containsKey(bookId) && users.containsKey(userId)) {
            Book book = books.get(bookId);
            if (!book.isReserved()) {
                book.reserve();
                System.out.println("Book reserved for user: " + users.get(userId).getName());
            } else {
                System.out.println("Book is already reserved.");
            }
        } else {
            System.out.println("Invalid book or user ID.");
        }
    }

    public void removeDuplicateBooks() {
        Set<String> seen = new HashSet<>();
        Iterator<Map.Entry<Integer, Book>> iterator = books.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Book> entry = iterator.next();
            Book book = entry.getValue();
            String key = book.getTitle().toLowerCase() + "-" + book.getAuthor().toLowerCase();

            if (seen.contains(key)) {
                iterator.remove();
            } else {
                seen.add(key);
            }
        }
    }

    public void displayBooks() {
        books.values().forEach(System.out::println);
    }

    public void displayUsers() {
        users.values().forEach(System.out::println);
    }
}
