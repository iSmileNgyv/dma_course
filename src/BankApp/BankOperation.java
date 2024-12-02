package BankApp;

import BankApp.Exceptions.InsufficientFundsException;
import BankApp.Exceptions.InvalidAmountException;

public class BankOperation extends AbstractBankOperation implements PaymentService{
    private final BankCustomer bankCustomer;
    public BankOperation(BankCustomer bankCustomer) {
        this.bankCustomer = bankCustomer;
    }
    @Override
    public void topUp(double amount) {
        if(amount <= 0) {
            throw new InvalidAmountException("Məbləğ 0-dan böyük olmalıdır");
        }
        this.bankCustomer.depositBalance(amount);
    }

    @Override
    public void checkBalance(double amount) {
        if(this.bankCustomer.getBalance() < amount) {
            throw new InsufficientFundsException(this.bankCustomer.getCurrentCustomer().getName() + ": balansda kifayət qədər vəsait yoxdur");
        }
    }

    @Override
    public void pay(double amount) {
        if(amount <= 0) {
            throw new InvalidAmountException("Məbləğ 0-dan böyük olmalıdır");
        }
        this.checkBalance(amount);
        this.bankCustomer.withdrawBalance(amount);
    }

    @Override
    public void refund(double amount) {
        this.topUp(amount);
    }

    public BankOperation selectCustomer(Customer customer) {
        bankCustomer.equals(customer);
        return this;
    }
}
