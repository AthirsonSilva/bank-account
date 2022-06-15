public class CheckingAccount extends Account {
    private double initialAccountOverdraftLimit;
    protected double accountOverdraftLimit;
    
    public CheckingAccount(String accountAgency, String accountNumber, Client client, double accountBalance, double accountTax) {
        super(accountAgency, accountNumber, client, accountBalance, accountTax);
        super.setAccountTax(11)
    }

    public void getAccountTax(double accountTax) {
        this.accountTax = accountTax;
    }
    
    public void setAccountOverdraftLimit() {
        this.accountOverdraftLimit = super.getAccountBalance();
        this.initialAccountOverdraftLimit = this.accountOverdraftLimit;
    }

    public boolean deposit(double value) {
        if (this.accountOverdraftLimit < this.initialAccountOverdraftLimit) {
            System.out.println("Initial: " + initialAccountOverdraftLimit + 
            "\nIs more than current: " + accountOverdraftLimit);

        	if ((this.accountOverdraftLimit + value) < this.initialAccountOverdraftLimit) {
                this.accountOverdraftLimit += value;
            } else {
                if ((this.accountOverdraftLimit += value) > this.initialAccountOverdraftLimit) {
                    double rest = this.accountOverdraftLimit - initialAccountOverdraftLimit;
                    this.accountOverdraftLimit = this.initialAccountOverdraftLimit;
                    super.setAccountBalance(super.getAccountBalance() + rest);
                } else {
                    this.accountOverdraftLimit += value;
                }
            }

            System.out.println("R$ " + value + " was deposited with success.");
            return true;
        } 
        
        super.setAccountBalance(super.getAccountBalance() + value);
        System.out.println("R$ " + value + " was deposited with success.");
        
        return true;
    }

    @Override
    public boolean takeout(double value) {
        if ((super.getAccountBalance() + this.accountOverdraftLimit) < value) {
            System.out.println("Not enough money deposited.");

            return false;
        } else {
            if (super.getAccountBalance() < value) {
                value -= super.getAccountBalance();
                super.setAccountBalance(0);
                this.accountOverdraftLimit -= value;
                System.out.println("R$ " + value + " was taken with success.");
                
                showInfo();

                return true;
            } else if (super.getAccountBalance() > value) {
                super.setAccountBalance(super.getAccountBalance() - value);
                showInfo();

                System.out.println("R$ " + value + " was taken with success.");
                return true;
            }

            System.out.println("Balance insufficient.");
            return false;
        }
    }
    
    @Override
    public void showInfo() {

        System.out.println("\nACCOUNT INFO: ");
        System.out.println("\tAccount balance: " + super.getAccountBalance());
        System.out.println("\tAccount number: " + super.getAccountNumber());
        System.out.println("\tAccount agency: " + super.getAccountAgency());
        System.out.println("\tAccount tax: " + this.accountTax);
        System.out.println("\tAccount limit: " + this.accountOverdraftLimit);
        System.out.println("\tAccount owner: " + super.client.getClientName());
    }
}
