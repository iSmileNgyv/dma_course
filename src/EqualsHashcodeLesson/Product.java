package EqualsHashcodeLesson;

public class Product{
    private int id;
    private double price;
    private String name;
    private Product[] products = new Product[10];
    private int productCount = 0;

    public Product() {}
    public Product(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        //return ((Product) o).getPrice() == this.getPrice() && ((Product) o).getName().equals(this.getName());
        return ((Product) o).id == this.id;

    }

    public void addProduct(Product product) {
        this.products[this.productCount] = product;
        this.productCount++;
    }

    public void addProducts(Product[] products) {
        this.products = products;
    }

    public boolean difference(Product[] products) {
        for(int i = 0; i < products.length; i++) {
            if(this.equals(products[i])) {
                return true;
            }
        }
        return false;
    }
}
