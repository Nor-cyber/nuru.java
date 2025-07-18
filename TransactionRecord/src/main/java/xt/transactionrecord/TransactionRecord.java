public class TransactionRecord {
    private String buyerTIN;
    private String sellerTIN;
    private double invoiceAmount;
    private String timestamp;

    // Constructor
    public TransactionRecord(String buyerTIN, String sellerTIN, double invoiceAmount, String timestamp) {
        this.buyerTIN = buyerTIN;
        this.sellerTIN = sellerTIN;
        this.invoiceAmount = invoiceAmount;
        this.timestamp = timestamp;
    }

    // Getters
    public String getBuyerTIN() { return buyerTIN; }
    public String getSellerTIN() { return sellerTIN; }
    public double getInvoiceAmount() { return invoiceAmount; }
    public String getTimestamp() { return timestamp; }

    // Setters
    public void setBuyerTIN(String buyerTIN) { this.buyerTIN = buyerTIN; }
    public void setSellerTIN(String sellerTIN) { this.sellerTIN = sellerTIN; }
    public void setInvoiceAmount(double invoiceAmount) { this.invoiceAmount = invoiceAmount; }
    public void setTimestamp(String timestamp) { this.timestamp = timestamp; }
}
