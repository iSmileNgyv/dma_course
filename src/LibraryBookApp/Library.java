package LibraryBookApp;

import LibraryBookApp.Exceptions.AlreadyRentedException;
import LibraryBookApp.Exceptions.NoBookException;
import LibraryBookApp.Exceptions.WrongOperationException;

import java.util.LinkedList;

public class Library {
    private LinkedList<Book> books = new LinkedList<>();

    public void addBook(Book book) {
        this.books.add(book);
        System.out.println(book.getName() + " adlı kitab kitabxanaya əlavə edildi");
    }

    public void removeBook(Book book) {
        int index = this.books.indexOf(book);
        if(index == -1) {
            throw new NoBookException("Kitab mövcud deyil");
        }
        this.books.remove(book);
        System.out.println(book.getName() + " adlı kitab kitabxanadan xaric edildi");
    }

    public void rentBook(Book book) {
        int index = this.books.indexOf(book);
        if(index == -1) {
            throw new NoBookException("Kitab mövcud deyil");
        }
        var foundBook = this.books.get(index);
        if(!foundBook.isAvailable()) {
            throw new AlreadyRentedException("Kitab artıq icarəyə verilib");
        }
        foundBook.setAvailable(false);
        System.out.println(foundBook.getName() + " adlı kitab icarəyə verildi");
    }

    public void returnBook(Book book) {
        int index = this.books.indexOf(book);
        if(index == -1) {
            throw new NoBookException("Kitab mövcud deyil");
        }
        var foundBook = this.books.get(index);
        if(foundBook.isAvailable()) {
           throw new WrongOperationException("Kitab kitabxanamıza aid deyil");
        }
        foundBook.setAvailable(true);
        System.out.println(foundBook.getName() + " adlı kitab kitabxanaya geri qaytarıldı");
    }

    public void showAvailableBooks() {
        int cnt = 1;
        for(Book book : this.books.stream().filter(Book::isAvailable).toList()) {
            System.out.println(cnt + ") Ad: " + book.getName());
            cnt++;
        }
    }
}
