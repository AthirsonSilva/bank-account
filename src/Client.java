public class Client {
    protected String clientName;
    protected String clientCpf;
    protected String clientEmail;
    protected double accountTax;

    public Client() {
        this.clientName = null;
        this.clientCpf = null;
        this.clientEmail = null;
    }

    public Client(String clientName, String clientCpf, String clientEmail) {
        this.clientName = clientName;
        this.clientCpf = clientCpf;
        this.clientEmail = clientEmail;
    }
    
    public void showData() {
        System.out.println(this.getClientCpf());
        System.out.println(this.getClientName());
        System.out.println(this.getClientEmail());
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setClientCpf(String clientCpf) {
        this.clientCpf = clientCpf;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientName() {
        return this.clientName;
    }

    public String getClientCpf() {
        return this.clientCpf;
    }

    public String getClientEmail() {
        return this.clientEmail;
    }

    public double getAccountTax() {
        return this.accountTax;
    }

    public void setAccountTax(double tax) {
        this.accountTax = tax;
    }

}