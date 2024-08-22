package LibraryManagement.UtilsBooks;

import java.util.Scanner;
import LibraryManagement.UtilsBooks.BookManagement;
import LibraryManagement.UtilsBooks.ConcreteBook;

public class Libraryteste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookManagement bookManagement = new BookManagement();
        int option;

        do {
            System.out.print("\nChoose the desired option:    " +
                    "\n[1] List available books.    " +
                    "\n[2] Add a book to your library   " +
                    "\n[3] Remove a book from your library   " +
                    "\n[4] Update a library book    " +
                    "\n[5] Search for a book  " +
                    "\n[6] Exit\n");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    bookManagement.printBooks();
                    break;
                case 2:
                    System.out.print("Enter the book title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter the book author: ");
                    String bookAuthor = scanner.nextLine();
                    System.out.print("Enter the book year: ");
                    int bookYear = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter the book ISBN: ");
                    String bookISBN = scanner.nextLine();

                    ConcreteBook newBook = new ConcreteBook(bookTitle, bookAuthor, bookYear, bookISBN);
                    bookManagement.addBook(newBook);
                    break;
                case 3:
                    System.out.print("Enter the title of the book to remove: ");
                    String titleToRemove = scanner.nextLine();
                    bookManagement.removeBookByTitle(titleToRemove);
                    break;

                case 4:
                    System.out.println("Enter the ISBN of the book to update: ");
                    String isbnToUpdate = scanner.nextLine();
                    System.out.println("Enter the new book title: ");
                    String newTitle = scanner.nextLine();
                    System.out.println("Enter the new book author: ");
                    String newAuthor = scanner.nextLine();
                    System.out.println("Enter the new book year: ");
                    int newYear = scanner.nextInt();
                    scanner.nextLine();  // Consome a nova linha

                    ConcreteBook updatedBook = new ConcreteBook(newTitle, newAuthor, newYear, isbnToUpdate);  // Cria o livro atualizado
                    bookManagement.updateBook(isbnToUpdate, updatedBook);
                    break;
                case 5:
                    System.out.println("Search functionality not implemented yet.");
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 6);

        scanner.close();
    }

}

