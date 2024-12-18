package StreamAPI;

public class Main {
    public static void main(String[] args) {
        var customer = new Customer();
        customer.addCustomer(new Customer("Ali", 400));
        customer.addCustomer(new Customer("Ismayil", 200));
        for(Customer c : customer.getFilteredCustomers()) {
            System.out.println(c.getName() + " " + c.getDebt());
        }
    }
}
