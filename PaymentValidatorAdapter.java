class PaymentValidatorAdapter implements PaymentMethod {
    private PaymentMethod paymentMethod;
    private ExternalPaymentValidator validator;

    public PaymentValidatorAdapter(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
        this.validator = new ExternalPaymentValidator();
    }

    public boolean processPayment(double amount) {
        if (validator.validate(amount)) {
            return paymentMethod.processPayment(amount);
        } else {
            System.out.println("Payment validation failed.");
            return false;
        }
    }
}