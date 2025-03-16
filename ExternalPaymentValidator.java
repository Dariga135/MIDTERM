public class ExternalPaymentValidator {
    public boolean validate(double amount) {
        System.out.println("Validating payment of: $" + amount);
        return amount > 0;
    }
}