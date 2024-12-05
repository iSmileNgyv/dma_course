package LibraryBookApp;

import LibraryBookApp.Exceptions.AlreadyRentedException;
import LibraryBookApp.Exceptions.NoBookException;
import LibraryBookApp.Exceptions.WrongOperationException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Library {
    private LinkedList<Book> books = new LinkedList<>();
    private HashMap<Book, List<String>> log = new HashMap<>();

    public void addBook(Book book) {
        this.books.add(book);
        this.addLog(book, "add");
        //System.out.println(book.getName() + " adlı kitab kitabxanaya əlavə edildi");
    }

    public void removeBook(Book book) {
        int index = this.books.indexOf(book);
        if(index == -1) {
            throw new NoBookException("Kitab mövcud deyil");
        }
        this.books.remove(book);
        this.addLog(book, "remove");
        //System.out.println(book.getName() + " adlı kitab kitabxanadan xaric edildi");
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
        foundBook.setRentedAt(LocalDateTime.now());
        this.addLog(foundBook, "rent");
        //System.out.println(foundBook.getName() + " adlı kitab icarəyə verildi");
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
        this.addLog(foundBook, "return");
        //System.out.println(foundBook.getName() + " adlı kitab kitabxanaya geri qaytarıldı");
    }

    private void addLog(Book book, String operation) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);
        String logEntry = switch (operation.toLowerCase()) {
            case "add" -> book.getName() + " adlı kitab " + formattedDate + " tarixində kitabxanaya əlavə edildi";
            case "rent" -> book.getName() + " adlı kitab " + formattedDate + " tarixində icarəyə verildi";
            case "return" -> book.getName() + " adlı kitab " + formattedDate + " tarixində kitabxanaya geri qaytarıldı";
            case "remove" -> book.getName() + " adlı kitab " + formattedDate + " tarixində kitabxanadan xaric edildi";
            default -> throw new WrongOperationException("Yanlış əməliyyat");
        };
        this.log.computeIfAbsent(book, k -> new ArrayList<>()).add(logEntry);
    }

    public void showAvailableBooks() {
        int cnt = 1;
        for(Book book : this.books.stream().filter(Book::isAvailable).toList()) {
            System.out.println(cnt + ") Ad: " + book.getName());
            cnt++;
        }
    }

    public void showLogs(Book book) {
        List<String> logs = this.log.get(book);
        if (logs != null) {
            logs.forEach(System.out::println);
        }
    }
}
