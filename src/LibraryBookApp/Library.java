package LibraryBookApp;

import LibraryBookApp.Exceptions.AlreadyRentedException;
import LibraryBookApp.Exceptions.BookIsExistsException;
import LibraryBookApp.Exceptions.NoBookException;
import LibraryBookApp.Exceptions.WrongOperationException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Library {
    private LinkedList<Map.Entry<String, Set<Book>>> books = new LinkedList<>();
    private HashMap<Book, List<String>> log = new HashMap<>();

    public void addBook(Book book) {
        for (Map.Entry<String, Set<Book>> entry : this.books) {
            if (entry.getKey().equals(book.getBarcode())) {
                throw new BookIsExistsException("Bu barcode-a sahib kitab artıq mövcuddur");
            }
        }
        Set<Book> newBookSet = new HashSet<>();
        newBookSet.add(book);
        this.books.add(new AbstractMap.SimpleEntry<>(book.getBarcode(), newBookSet));
        this.addLog(book, "add");
    }

    public void removeBook(Book book) {
        boolean bookFound = false;
        for (Map.Entry<String, Set<Book>> entry : this.books) {
            Set<Book> bookSet = entry.getValue();
            if (bookSet.contains(book)) {
                bookSet.remove(book);
                bookFound = true;
                this.addLog(book, "remove");
                break;
            }
        }
        if (!bookFound) {
            throw new NoBookException("Kitab mövcud deyil");
        }
    }

    public void rentBook(Book book) {
        for (Map.Entry<String, Set<Book>> entry : this.books) {
            Set<Book> bookSet = entry.getValue();
            if (bookSet.contains(book)) {
                if (!book.isAvailable()) {
                    throw new AlreadyRentedException("Kitab artıq icarəyə verilib");
                }
                book.setAvailable(false);
                book.setRentedAt(LocalDateTime.now());
                this.addLog(book, "rent");
                break;
            }
        }
        throw new NoBookException("Kitab mövcud deyil");
    }

    public void returnBook(Book book) {
        for (Map.Entry<String, Set<Book>> entry : this.books) {
            Set<Book> bookSet = entry.getValue();
            if (bookSet.contains(book)) {
                if (book.isAvailable()) {
                    throw new WrongOperationException("Kitab kitabxanamıza aid deyil");
                }
                book.setAvailable(true);
                this.addLog(book, "return");
                break;
            }
        }

        throw new NoBookException("Kitab mövcud deyil");
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
        for (Map.Entry<String, Set<Book>> entry : this.books) {
            for (Book book : entry.getValue()) {
                if (book.isAvailable()) {
                    System.out.println(cnt + ") Ad: " + book.getName());
                    cnt++;
                }
            }
        }
    }

    public void showLogs(Book book) {
        List<String> logs = this.log.get(book);
        if (logs != null) {
            logs.forEach(System.out::println);
        }
    }
}
