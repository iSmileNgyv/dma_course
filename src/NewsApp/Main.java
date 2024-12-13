package NewsApp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        Author<String> author = new Author<>("Ismayil", "Nagiyev");
        News<String, String> news = new News<>(
                "Technology",
                "IT",
                author,
                LocalDateTime.now()
        );
        System.out.println(news);
    }
}
