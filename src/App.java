import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
      mainMenu();
    }
    
    public static void mainMenu() {
      Client client = new Client("Athirson", "111.111.111-11", "email@email.com"); 
    	
    	System.out.print("\nWelcome! \n\nDo you want to open a checking or a saving account? [1: Checking/ 2: Saving]: ");
    	
    	int choice = scanner.nextInt();
    	
      if (choice == 1) {
         setCheckingAccount(client);
      } else if (choice == 2) {
         setSavingAccount(client);
      } else {
         System.out.println("No valid choice, finishing the app. If you want to try again, rerun the app...");
      }
    }

    public static void setCheckingAccount(Client client) {
      CheckingAccount checkAccount = new CheckingAccount("checking agency", "123", client, 100);
      System.out.println("\nWelcome to the checking section!\n");

      checkAccount.setAccountTax();
      checkAccount.setAccountOverdraftLimit();
            
      checkMenu(checkAccount);
    }

    public static void setSavingAccount(Client client) {
      SavingAccount savingAccount = new SavingAccount("saving agency", "321", client, 100);
      System.out.println("\nWelcome to saving the section!\n");

      savingAccount.setAccountBirthday();
      savingAccount.setAccountRevenue();
        
      savingMenu(savingAccount);
    }

    public static void checkMenu(CheckingAccount checkingAccount) {    	
      while (true) {
         System.out.print("\nWelcome to the account menu! \n\nDeposit or takeout? [1: Info/ 2: Deposit/ 3: Takeout/ 4: Exit]: ");

          int choice = scanner.nextInt();
          
           if (choice == 1) {
               checkingAccount.showInfo();
           } else if (choice == 2) {
              System.out.print("Value to deposit: ");
              
               checkingAccount.deposit(scanner.nextDouble());
           } else if (choice == 3) {
              System.out.print("Value to takeout: ");
              
               checkingAccount.takeout(scanner.nextDouble());
           } else if (choice == 4) {
              System.out.print("Exiting system...");
              
              break;
           } else {
               System.out.println("No valid choice, finishing the app. If you want to try again, rerun the app...");
           }               
      }
      
   }

   public static void savingMenu(SavingAccount savingAccount) {    	
      while (true) {
         System.out.print("\nWelcome to the account menu! \n\nDeposit or takeout? [1: Info/ 2: Deposit/ 3: Takeout/ 4: Exit]: ");

          int choice = scanner.nextInt();
          
           if (choice == 1) {
               savingAccount.showInfo();
           } else if (choice == 2) {
              System.out.print("Value to deposit: ");
              
               savingAccount.deposit(scanner.nextDouble());
           } else if (choice == 3) {
              System.out.print("Value to takeout: ");
              
               savingAccount.takeout(scanner.nextDouble());
           } else if (choice == 4) {
              System.out.print("Exiting system...");
              
              break;
           } else {
               System.out.println("No valid choice, finishing the app. If you want to try again, rerun the app...");
           }               
      }
      
   }
}