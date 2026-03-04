import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add User");
            System.out.println("2. Add/Update Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Display Users");
            System.out.println("5. Display Books");
            System.out.println("6. Reserve Book");
            System.out.println("7. Remove Duplicate Books");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter User ID: ");
                    int userId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter User Name: ");
                    String userName = scanner.nextLine();
                    library.addUser(new User(userId, userName));
                    break;

                case 2:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    library.addOrUpdateBook(new Book(bookId, title, author));
                    break;

                case 3:
                    System.out.print("Enter Book ID to delete: ");
                    int deleteId = scanner.nextInt();
                    library.deleteBook(deleteId);
                    break;

                case 4:
                    library.displayUsers();
                    break;

                case 5:
                    library.displayBooks();
                    break;

                case 6:
                    System.out.print("Enter Book ID to reserve: ");
                    int reserveBookId = scanner.nextInt();
                    System.out.print("Enter User ID: ");
                    int reserveUserId = scanner.nextInt();
                    library.reserveBook(reserveBookId, reserveUserId);
                    break;

                case 7:
                    library.removeDuplicateBooks();
                    System.out.println("Duplicate books removed.");
                    break;

                case 8:
                    running = false;
                    System.out.println("Exiting Library System...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
