import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(quvveteYukselt(a, b));
    }

    public static long quvveteYukselt(int a, int b) {
        long res = 1;
        for(int i = 0; i < b; i++){
            res *= a;
        }
        return res;
    }
}
