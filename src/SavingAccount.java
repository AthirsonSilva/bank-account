import java.util.Calendar;

public class SavingAccount extends Account {
    private double accountRevenue;
    private int accountBirthday;

    public SavingAccount(String accountAgency, String accountNumber, Client client, double accountBalance, double accountTax) {
        super(accountAgency, accountNumber, client, accountBalance, accountTax);
        super.setAccountTax(1.5);
    }

    public void setAccountRevenue() {
        this.accountRevenue = super.getAccountBalance() / 100;
    }

    public void setAccountBirthday() {    	
        this.accountBirthday = Calendar.getInstance().get(Calendar.DAY_OF_MONTH); 
    }

    public double getAccountRevenue() {
        return this.accountRevenue;
    }

    public int getAccountBirthday() {
        return this.accountBirthday;
    }

    @Override
    public boolean deposit(double value) {
        System.out.println("R$ " + value + " was deposited with success.");
        super.setAccountBalance(super.getAccountBalance() + value);
        
        return true;
    }

    @Override
    public boolean takeout(double value) {
        if (value <= super.getAccountBalance()) {
            System.out.println("R$ " + value + " was taken with success.");
            super.setAccountBalance(super.getAccountBalance() - value);
        }
        
        System.out.println("Value insufficient.");
        return false;
    }
    
    @Override
    public void showInfo() {

        System.out.println("\nACCOUNT INFO: ");
        System.out.println("\tAccount balance: " + super.getAccountBalance());
        System.out.println("\tAccount number: " + super.getAccountNumber());
        System.out.println("\tAccount agency: " + super.getAccountAgency());        
        System.out.println("\tAccount birth day: " + this.accountBirthday);
        System.out.println("\tCreation day: " + Calendar.getInstance().getTime());
        System.out.println("\tAccount revenue: " + this.accountRevenue);
        System.out.println("\tAccount owner: " + super.client.getClientName());
    }
}
