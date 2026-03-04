package LibrarySystem;


public class Book {
	
	
    private int bookId;
    private String title;
    private String author;
    private boolean reserved;

  
    
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.reserved = false;
    }

    public int getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isReserved() { return reserved; }

    public void reserve() { this.reserved = true; }
    public void unreserve() { this.reserved = false; }
}
