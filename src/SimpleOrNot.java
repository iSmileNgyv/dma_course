import java.util.Scanner;
public class SimpleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = "Sadə";
        for(int i = 2; i <= (int) Math.sqrt(n); i++) {
            if(n % i == 0) {
                res = "Mürəkkəb";
                break;
            }
        }
        System.out.println(res);
    }
}