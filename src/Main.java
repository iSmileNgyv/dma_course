public class Main {
    public static void main(String[] args) {
        CalcInterface add = Integer::sum;
        CalcInterface subtract = (a, b) -> a - b;
        CalcInterface multiply = (a, b) -> a * b;
        CalcInterface divide = (a, b) -> (double) a / b;
        CalcInterface max = Math::max;
        CalcInterface min = Math::min;

        System.out.println(add.calculate(1, 4));
        System.out.println(subtract.calculate(1, 4));
        System.out.println(multiply.calculate(1, 4));
        System.out.println(divide.calculate(1, 4));
        System.out.println(max.calculate(1, Integer.MAX_VALUE));
        System.out.println(min.calculate(1, Integer.MIN_VALUE));
    }
}