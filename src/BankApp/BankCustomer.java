package BankApp;

import BankApp.Exceptions.NoCustomerException;

public class BankCustomer {
    private Customer[] customer = new Customer[100];
    private int customerCount = 0;
    private Customer currentCustomer;
    public BankCustomer() {}

    public BankCustomer(Customer[] customers) {
        this.customer = customers;
    }

    public Customer getCurrentCustomer() {
        return this.currentCustomer;
    }

    public void addCustomer(Customer customer) {
        this.customer[this.customerCount] = customer;
        this.customerCount++;
        System.out.println(customer.getName() + " adlı müştəri sistemə əlavə edildi");
    }

    public int getCustomerCount() {
        return this.customerCount;
    }

    public void depositBalance(double amount) {
        this.currentCustomer.setBalance(this.currentCustomer.getBalance() + amount);
        System.out.println(this.currentCustomer.getName() + " balans artırdı: " + amount);
    }

    public void withdrawBalance(double amount) {
        this.currentCustomer.setBalance(this.currentCustomer.getBalance() - amount);
        System.out.println(this.currentCustomer.getName() + " ödəniş etdi: " + amount);
    }

    public double getBalance() {
        return this.currentCustomer.getBalance();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Customer)) return false;
        Customer other = (Customer) o;
        for(Customer c : this.customer) {
            if(c == null) {
                throw new NoCustomerException("Müştəri mövcud deyil");
            }
            if(c.getId() == other.getId()) {
                this.currentCustomer = other;
                return true;
            }
        }
        throw new NoCustomerException("Müştəri mövcud deyil");
    }
}
