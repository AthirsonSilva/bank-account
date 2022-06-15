public class TaxControl {
    private static double sum;

    public static void registerOperation(CheckingAccount checkingAccount) {
        double tax = checkingAccount.getAccountTax();
        TaxControl.sum = TaxControl.sum + tax;

    public public static double getSum() {
        return this.sum;
    }
}