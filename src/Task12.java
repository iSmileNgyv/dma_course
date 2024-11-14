import java.math.BigInteger;
public class Task12 {
    public static void main(String[] args) {
        BigInteger bugda = BigInteger.ONE;
        BigInteger toplam = BigInteger.ZERO;
        for (int i = 0; i < 64; i++) {
            toplam = toplam.add(bugda);
            bugda = bugda.multiply(BigInteger.valueOf(2));
        }
        System.out.println("Ümumi buğda sayı: " + toplam);
    }
}
