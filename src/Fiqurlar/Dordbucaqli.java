package Fiqurlar;

public class Dordbucaqli extends Fiqur{
    @Override
    public int tereflerinSayi(int num) {
        return num;
    }

    @Override
    public String ad(String ad) {
        return ad;
    }

    @Override
    public void displayInfo() {
        System.out.println(
                "Ad: " + this.ad("Kvadrat") +
                        "\nTereflerin sayi: " + this.tereflerinSayi(4)
        );
    }
}
