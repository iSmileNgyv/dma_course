package BankAccountApp;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber(123);
        account.deposit(100);
        account.withdraw(50);
        System.out.println(account);
        BankAccount account2 = new BankAccount();
        account2.setAccountNumber(123);
        account2.deposit(100);
        account.equals(account2);
        System.out.println(account2);

        BankAccount account3 = new BankAccount();
        account3.setAccountNumber(1234);
        account3.deposit(100);
        account3.equals(account2);
        System.out.println(account3);

        // equals ile accountNumber eynidirse balance birləşdirir
    }
}

