package Model;
public class TaxControl {
    private static double sum;

    public static void registerOperation(Account account) {
        TaxControl.sum = TaxControl.sum + account.getAccountTax();
    }

    public static double getSum() {
        return TaxControl.sum;
    }
}