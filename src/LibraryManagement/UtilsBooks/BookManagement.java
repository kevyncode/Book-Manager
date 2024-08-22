package LibraryManagement.UtilsBooks;

import java.util.ArrayList;

//Creating class BookManagement and their methods
public class BookManagement {
    private ArrayList<Books> books;

    public BookManagement() {
        books = new ArrayList<>();
    }

    public void addBook(Books book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    public void printBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Books book : books) {
                System.out.println("Title: " + book.getTitle() +
                        ", Author: " + book.getAuthor() +
                        ", Year: " + book.getYear() +
                        ", ISBN: " + book.getIsbn());
            }
        }
    }

    public void updateBook(String isbn, Books updatedBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)) {
                books.set(i, updatedBook);
                System.out.println("Updated book: " + updatedBook.getTitle());
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }


    public void removeBook(Books book) {
        if (books.remove(book)) {
            System.out.println("Removed book: " + book.getTitle());
        } else {
            System.out.println("Book not found.");
        }
    }
}
