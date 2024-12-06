package LibraryBookApp;

public class Main {
    public static void main(String[] args) {
        var book = new Book();
        var library = new Library();
        String errorMessage = null;
        try {

            book.setBarcode("12e345");
            book.setName("Harry Potter");
            book.setAuthor("Harry Potter");
            book.setAvailable(true);

            var book2 = new Book();
            book2.setBarcode("12e345");
            book2.setName("Harry Potter");
            book2.setAuthor("Harry Potter");
            book2.setAvailable(true);


            library.addBook(book);
            //library.addBook(book2);
            //library.removeBook(book);
            library.rentBook(book);
            library.returnBook(book);
            library.returnBook(book);

        }catch(Exception e) {
            //System.err.println(e.getMessage());
            errorMessage = e.getMessage();
        }
        finally {
            library.showAvailableBooks();
            library.showLogs(book);
        }
        if(!errorMessage.isEmpty()) {
            System.err.println(errorMessage);
        }
    }
}
