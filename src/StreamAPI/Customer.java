package StreamAPI;
import java.awt.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Customer {
    private String name;
    private double debt;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Customer() {}
    public Customer(String name, double debt) {
        this.name = name;
        this.debt = debt;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public ArrayList<Customer> getFilteredCustomers() {
        return this.customers.stream().
                filter(c -> c.getDebt() > 350)
                .peek(c -> {
                    c.setDebt(c.getDebt() * 1.5);
                })
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
