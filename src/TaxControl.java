public class TaxControl {
    private static double sum;

    public static void registerOperation(Account account) {
        double tax = account.getAccountTax();
        TaxControl.sum = TaxControl.sum + tax;
    }

    public public static double getSum() {
        return this.sum;
    }
}