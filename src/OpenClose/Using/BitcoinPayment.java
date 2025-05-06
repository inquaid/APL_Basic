package OpenClose.Using;

public class BitcoinPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing Bitcoin payment...");
    }
}
