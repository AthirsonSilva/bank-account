package Model;
public abstract class Account {
    protected String accountNumber;
    protected String accountAgency;
    protected double accountBalance;
    protected Client client;
    protected double tax;

    public Account(String accountAgency, String accountNumber, Client client, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountAgency = accountAgency;
        this.accountBalance = accountBalance;
        this.client = client;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountAgency(String accountAgency) {
        this.accountAgency = accountAgency;
    }

    public void setAccountTax(double tax) {
        this.tax = tax;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountAgency() {
        return accountAgency;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double getAccountTax() {
        return this.tax;
    }
    
    public abstract boolean deposit(double value);

    public abstract boolean takeout(double value);
    
    public abstract void showInfo();
}
