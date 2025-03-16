public class PayPalPaymentFactory extends PaymentFactory {
    public PaymentMethod createPaymentMethod() {
        return new PayPalPayment();
    }
}