package Calc;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Toplama t = new Toplama();
        //Vurma vurma = new Vurma();
        //Bolme bolme = new Bolme();
        Cixma cixma = new Cixma();
        System.out.println(cixma.hesabla(scanner.nextBigInteger(), scanner.nextBigInteger()));
    }
}
