public class CryptoPayment implements PaymentMethod {
    public boolean processPayment(double amount) {
        System.out.println("Processing Crypto payment of: $" + amount);
        return true;
    }
}