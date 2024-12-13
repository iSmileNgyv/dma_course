package NewsApp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class News<T, U> {
    private T category;
    private String name;
    private Author<U> author;
    private LocalDateTime publishDate;
    public News(T category, String name, Author<U> author, LocalDateTime publishDate) {
        this.category = category;
        this.name = name;
        this.author = author;
        this.publishDate = publishDate;
    }
    public T getCategory() {
        return category;
    }
    public String getName() {
        return name;
    }
    public Author<U> getAuthor() {
        return author;
    }
    public LocalDateTime getPublishDate() {
        return publishDate;
    }
    public String getFormattedPublishDate(DateTimeFormatter formatter) {
        return publishDate.format(formatter);
    }
    @Override
    public String toString() {
        DateTimeFormatter defaultFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return "News{" +
                "category=" + category +
                ", name='" + name + '\'' +
                ", author=" + author +
                ", publishDate=" + getFormattedPublishDate(defaultFormatter) +
                '}';
    }
}
