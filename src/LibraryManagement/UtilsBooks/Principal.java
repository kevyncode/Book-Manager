package LibraryManagement.UtilsBooks;

public class Principal {
    public static void main(String[] args) {
        // Criação do gerenciador de livros
        BookManagement manager = new BookManagement();

        // Criação de livros
        Books book1 = new Books("Effective Java", "Joshua Bloch", 2018, "978-0134685991") {};
        Books book2 = new Books("Clean Code", "Robert C. Martin", 2008, "978-0132350884") {};

        // Adicionando livros
        manager.addBook(book1);
        manager.addBook(book2);

        // Listar livros antes da atualização
        System.out.println("Books before update:");
        manager.printBooks();

        // Atualizar um livro
        Books updatedBook = new Books("Effective Java - 3rd Edition", "Joshua Bloch", 2018, "978-0134685991") {};
        manager.updateBook("978-0134685991", updatedBook);

        // Listar livros após a atualização
        System.out.println("\nBooks after update:");
        manager.printBooks();

        // Remover um livro
        manager.removeBook(book2);

        // Listar livros após a remoção
        System.out.println("\nBooks after removal:");
        manager.printBooks();
    }
}
