package NewsApp;
import java.time.LocalDateTime;
public class Main {
    public static void main(String[] args) {
        Author<String> author = new Author<>("Ismayil", "Nagiyev");
        News<Category, String> news = new News<>(
                new Category("Technology"),
                "IT",
                author,
                LocalDateTime.now()
        );
        System.out.println(news);
    }
}
