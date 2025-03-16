public class CryptoPaymentFactory extends PaymentFactory {
    public PaymentMethod createPaymentMethod() {
        return new CryptoPayment();
    }
}