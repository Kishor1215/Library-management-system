public class Book {
    private int bookID;
    private String title;
    private String author;
    private String publisher;
    private boolean isAvailable;

    public Book(int bookID, String title, String author, String publisher) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isAvailable = true;
    }

    public int getBookID() { return bookID; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getPublisher() { return publisher; }
    public boolean isAvailable() { return isAvailable; }

    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
    public void setAvailable(boolean isAvailable) { this.isAvailable = isAvailable; }

    public void displayBook() {
        System.out.println("Book ID: " + bookID + "\nTitle: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher + "\nAvailable: " + (isAvailable ? "Yes" : "No"));
    }
}
