package BankApp;

public abstract class AbstractBankOperation {
    public abstract void topUp(double amount);
    public abstract boolean checkBalance(double amount);
}
