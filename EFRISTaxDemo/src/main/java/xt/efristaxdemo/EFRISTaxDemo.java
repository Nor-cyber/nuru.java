public class EFRISTaxDemo {
    public static void main(String[] args) {
        // (iii) Create an array of TaxCategory objects
        TaxCategory[] categories = {
            new Retailer(),
            new Wholesaler(),
            new Importer()
        };

        double[] transactionAmounts = {1000.0, 2500.0, 5000.0};

        // Demonstrating runtime polymorphism
        for (int i = 0; i < categories.length; i++) {
            double vat = categories[i].calculateVAT(transactionAmounts[i]);
            System.out.println("Transaction Amount: " + transactionAmounts[i]);
            System.out.println("VAT: " + vat);
            System.out.println("-----------------------------");
        }
    }
}
