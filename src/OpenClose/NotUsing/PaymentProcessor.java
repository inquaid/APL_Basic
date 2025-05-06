package OpenClose.NotUsing;

public class PaymentProcessor {
    void process(String paymentType) {
        if (paymentType.equalsIgnoreCase("credit")) {
            System.out.println("Processing credit card payment...");
        } else if (paymentType.equalsIgnoreCase("paypal")) {
            System.out.println("Processing paypal payment...");
        }
    }
}
