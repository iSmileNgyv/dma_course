import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        int cnt = 0;
        for(long i = num; i > 0; i/=10) {
            cnt++;
        }
        System.out.println(cnt + " rəqəmli");
    }
}
