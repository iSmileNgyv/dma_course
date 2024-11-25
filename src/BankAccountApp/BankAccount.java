package BankAccountApp;
public class BankAccount {
    private int accountNumber;
    private double balance = 0;
    private boolean hasError = false;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(this.accountNumber == 0) {
            this.hasError = true;
            System.out.println("Error: No account number entered");
        }
        else {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if(this.accountNumber == 0) {
            this.hasError = true;
            System.out.println("Error: No account number entered");
        }
        else if(amount <= this.balance) {
            this.balance -= amount;
        }
        else {
            this.hasError = true;
            System.out.println("Error: Insufficient funds");
        }
    }

    @Override
    public String toString() {
        if(!this.hasError) {
            return "Account number: " + this.accountNumber + "\nBalance: " + this.balance;
        }
        return "";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankAccount that = (BankAccount) o;
        if (this.accountNumber == that.accountNumber) {
            this.balance += that.balance;
            that.balance = this.balance;
            return true;
        }
        return false;
    }
}
