import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch(input) {
            case "Yanvar":
                System.out.println("Qış fəsli");
                break;
            case "Fevral":
                System.out.println("Qış fəsli");
                break;
            case "Dekabr":
                System.out.println("Qış fəsli");
                break;
            case "Mart":
                System.out.println("Yaz fəsli");
                break;
            case "Aprel":
                System.out.println("Yaz fəsli");
                break;
            case "May":
                System.out.println("Yaz fəsli");
                break;
            case "İyun":
                System.out.println("Yay fəsli");
                break;
            case "İyul":
                System.out.println("Yay fəsli");
                break;
            case "Avqust":
                System.out.println("Yay fəsli");
                break;
            case "Sentyabr":
                System.out.println("Payız fəsli");
                break;
            case "Oktyabr":
                System.out.println("Payız fəsli");
                break;
            case "Noyabr":
                System.out.println("Payız fəsli");
                break;
            default:
                System.out.println("Mövcud deyil");
                break;
        }
    }
}
