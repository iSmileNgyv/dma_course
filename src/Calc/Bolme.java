package Calc;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Bolme {
    public BigDecimal hesabla(BigInteger a, BigInteger b) {
        return new BigDecimal(a).divide(new BigDecimal(b), 10, RoundingMode.HALF_UP);
    }
}
