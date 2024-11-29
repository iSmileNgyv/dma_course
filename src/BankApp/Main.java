package BankApp;

public class Main {
    public static void main(String[] args) {
        try {
            var customer1 = new Customer(1, "Ismayil", 100);
            var customer2 = new Customer(2, "Eli", 100);

            var bankCustomer = new BankCustomer();
            bankCustomer.addCustomer(customer1);
            bankCustomer.addCustomer(customer2);
            var bankOperation = new BankOperation(bankCustomer);
            bankOperation.selectCustomer(customer1).topUp(50);
            bankOperation.pay(50);
            bankOperation.refund(100);
            bankOperation.selectCustomer(customer2).pay(150);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }


    }
}
