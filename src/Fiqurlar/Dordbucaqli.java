package Fiqurlar;

public class Dordbucaqli extends Fiqur{
    private int tereflerinSayi;
    private String ad;
    private final String KVADRAT = "Kvadrat";
    private final String DUZBUCAQLI = "Duzbucaqli";
    private double[] uzunluqlar = new double[this.tereflerinSayi];

    @Override
    public void tereflerinSayi(int num) {
        this.tereflerinSayi = num;
    }

    @Override
    public void ad(String ad) {
        this.ad = ad;
    }

    @Override
    public double perimetr() {
        switch(this.ad) {
            case KVADRAT:
                return this.uzunluqlar[0] * 4;
        }
        return 0;
    }

    @Override
    public void displayInfo() {
        this.tereflerinSayi(4);
        this.ad("Kvadrat");

        System.out.println(
                "Ad: " + this.ad
                 + "\nTereflerin sayi: " + this.tereflerinSayi
                 + "\nPerimetri: " + this.perimetr()
        );
    }

    @Override
    public void tereflerinUzunlugu(double[] uzunluqlar) {
        if(this.ad.equals(KVADRAT)) {
            this.uzunluqlar = new double[] {uzunluqlar[0]};
        }
        else {
            this.uzunluqlar = uzunluqlar;
        }

    }
}
