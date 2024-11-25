package EqualsHashcodeLesson;

public class Main {
    public static void main(String[] args) {
        var myProduct = new Product(1);
        myProduct.setName("alma");
        myProduct.setPrice(1.5);

        var productList = new Product[] {
                new Product(1),
                new Product(2),
                new Product(3)
        };

        System.out.println(myProduct.difference(productList));
        //System.out.println(product.hashCode() == product2.hashCode());
    }
}
