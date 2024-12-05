package LibraryBookApp;

public class Main {
    public static void main(String[] args) {
        var book = new Book();
        book.setBarcode(12345);
        book.setName("Harry Potter");
        book.setAuthor("Harry Potter");
        book.setAvailable(true);

        var library = new Library();
        library.addBook(book);
        library.removeBook(book);
        //library.rentBook(book);
        //library.returnBook(book);
        //library.returnBook(book);
        library.showAvailableBooks();

        library.showLogs(book);
    }
}
