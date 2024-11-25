package Fiqurlar;

public class Main {
    public static void main(String[] args) {
        var dordbucaqli = new Dordbucaqli();
        dordbucaqli.ad("Kvadrat");
        double[] uzunluqlar = {2};
        dordbucaqli.tereflerinUzunlugu(uzunluqlar);
        dordbucaqli.displayInfo();

        String a = "demo";
        String str = new String("demo");
        System.out.println(a.equals(str));
    }
}
