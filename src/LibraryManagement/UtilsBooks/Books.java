package LibraryManagement.UtilsBooks;
// Creating abstract Class Books and their attributes
public abstract class Books {
    private String title;
    private String author;
    private int year;
    private String isbn;
//Creating Constructor Methods
    public Books(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }
//Getters and Setters
    public String getTitle() {return title; }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {this.year = year;}

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {this.isbn = isbn;}
}
